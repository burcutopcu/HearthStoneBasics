package com.burcutopcu.hearthstonebasics.splashActivity

import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentHelper
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.GeneralInfoModelParseHelper
import com.burcutopcu.hearthstonebasics.helper.networkHelper.NetworkHelper
import com.burcutopcu.hearthstonebasics.helper.preferencesHelper.ISharedPreferencesManagement
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo
import com.burcutopcu.hearthstonebasics.util.PreferencesKeys
import com.google.gson.Gson
import javax.inject.Inject

class SplashActivityPresenter @Inject constructor(networkHelper: NetworkHelper,
                                                  hearthStoneRepo: IHearthStoneRepo,
                                                  iSharedPreferencesManagement: ISharedPreferencesManagement,
                                                  infoModelParseHelper: GeneralInfoModelParseHelper,
                                                  gson: Gson,
                                                  intentHelper: IntentHelper) : SplashActivityContract.Presenter{

    private lateinit var mView: SplashActivityContract.View
    private var mNetworkHelper = networkHelper
    private var mHearthStoneRepo: IHearthStoneRepo = hearthStoneRepo
    private var mInfoModelParseHelper=infoModelParseHelper
    private var mDefaultSharedPreferences: ISharedPreferencesManagement = iSharedPreferencesManagement
    private var mGson: Gson = gson
    private var mIntentHelper = intentHelper

    override fun setView(view: SplashActivityContract.View) {
        this.mView=view
    }

    override fun checkNetwork() {

        val isNetworkConnected = this.mNetworkHelper.isNetworkConnected()

        if (isNetworkConnected) {

            this.mView.getCardInfos()

        } else {

            this.mView.showNetworkConnectionDialog()

        }

    }

    override fun getCardInfos() {

        mHearthStoneRepo.getGeneralInfo(object : IServiceResponseCallback<GeneralInfoModel> {

            override fun onServerCompleted(generalInfoModel: GeneralInfoModel) {

                val json = mGson.toJson(generalInfoModel)

                if (json != null) {

                    mDefaultSharedPreferences.setAsBoolean(PreferencesKeys.ARE_THERE_INFO_MODEL, true)

                    mDefaultSharedPreferences.setAsString(PreferencesKeys.INFO_MODEL_LIST,json)

                    mView.goToMainActivity(mIntentHelper.getMainActivityIntent())

                }
            }

            override fun onServerError(error: String?) {

            }
        })
    }
}