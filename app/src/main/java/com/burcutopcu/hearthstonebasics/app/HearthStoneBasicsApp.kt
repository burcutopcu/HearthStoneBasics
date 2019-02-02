package com.burcutopcu.hearthstonebasics.app

import android.app.Application
import android.preference.PreferenceManager
import com.facebook.stetho.Stetho

class HearthStoneBasicsApp : Application() {

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        Stetho.initializeWithDefaults(this)
    }
}