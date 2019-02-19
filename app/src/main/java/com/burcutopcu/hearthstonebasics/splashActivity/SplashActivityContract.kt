package com.burcutopcu.hearthstonebasics.splashActivity

import android.content.Intent

interface SplashActivityContract {

    interface View {

        fun showNetworkConnectionDialog()

        fun getCardInfos()

        fun showLoadingView()

        fun hideLoadingView()

        fun goToMainActivity(intent: Intent)

    }

    interface Presenter {

        fun setView(view: View)

        fun checkNetwork()

        fun getCardInfos()

    }
}