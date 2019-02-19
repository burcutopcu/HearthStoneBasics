package com.burcutopcu.hearthstonebasics.splashActivity

import com.burcutopcu.hearthstonebasics.app.AppModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class,SplashActivityModule::class))
interface SplashActivityComponent {
    fun inject(splashActivity: SplashActivity)
}