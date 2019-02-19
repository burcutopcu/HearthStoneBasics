package com.burcutopcu.hearthstonebasics.helper.networkHelper

import android.content.Context
import android.net.ConnectivityManager

class NetworkHelper(context: Context) {

    private var mContext: Context

    init {
        this.mContext = context
    }

    fun isNetworkConnected(): Boolean {

        val connectivityManager = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return if (connectivityManager.activeNetworkInfo != null) {
            val networkInfo = connectivityManager.activeNetworkInfo
            networkInfo.isConnected
        } else {
            return false
        }

    }
}