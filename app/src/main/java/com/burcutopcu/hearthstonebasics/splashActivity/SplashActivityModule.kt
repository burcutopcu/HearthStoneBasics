package com.burcutopcu.hearthstonebasics.splashActivity

import android.content.Context
import com.burcutopcu.hearthstonebasics.api.ApiManager
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentHelper
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.GeneralInfoModelParseHelper
import com.burcutopcu.hearthstonebasics.helper.networkHelper.NetworkHelper
import com.burcutopcu.hearthstonebasics.helper.preferencesHelper.DefaultSharedPreferences
import com.burcutopcu.hearthstonebasics.helper.preferencesHelper.ISharedPreferencesManagement
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides


@Module
class SplashActivityModule {

    @Provides
    fun provideNetworkHelper(context: Context): NetworkHelper {
        return NetworkHelper(context)
    }

    @Provides
    fun provideISharedPreferencesManagement(context: Context): ISharedPreferencesManagement {
        return DefaultSharedPreferences(context)
    }

    @Provides
    fun provideIntentIntent(context: Context): IntentHelper {
        return IntentHelper(context)
    }

    @Provides
    fun provideGeneralInfoModelParseHelper(): GeneralInfoModelParseHelper {
        return GeneralInfoModelParseHelper()
    }

    @Provides
    fun provideHearthStoneRepo(apiManager: ApiManager): IHearthStoneRepo {
        return HearthStoneRepo(apiManager)
    }

}