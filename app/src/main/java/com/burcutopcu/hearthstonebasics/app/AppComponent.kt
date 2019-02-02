package com.burcutopcu.hearthstonebasics.app

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
}