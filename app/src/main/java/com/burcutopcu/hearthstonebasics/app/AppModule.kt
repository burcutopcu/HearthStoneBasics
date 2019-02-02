package com.burcutopcu.hearthstonebasics.app

import android.content.Context
import com.burcutopcu.hearthstonebasics.api.ApiManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(context: Context) {
    private var mContext=context

    @Singleton
    @Provides
    fun provideContext():Context {
        return mContext
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Singleton
    @Provides
    fun provideApiManager():ApiManager{
        return ApiManager()
    }
}