package com.burcutopcu.hearthstonebasics.api

interface IServiceResponseCallback<T> {

    fun onServerError(error: String?)

    fun onServerCompleted(t: T) {
    }

    fun onServerCompleted() {
    }

}