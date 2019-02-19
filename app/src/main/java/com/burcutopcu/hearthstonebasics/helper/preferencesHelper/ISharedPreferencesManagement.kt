package com.burcutopcu.hearthstonebasics.helper.preferencesHelper

interface ISharedPreferencesManagement {

    fun setAsString(key: String, value: String)

    fun getAsString(key: String, defaultValue: String): String

    fun setAsInteger(key: String, value: Int)

    fun getAsInteger(key: String, defaultValue: Int): Int

    fun setAsBoolean(key: String, value: Boolean)

    fun getAsBoolean(key: String, defaultBoolean: Boolean): Boolean

    fun setAsLong(key: String, value: Long)

    fun getAsLong(key: String, defaultValue: Long): Long

    fun deleteData(key: String)

    fun deleteAllData()

    fun setAsModel(key: List<String>, defaultValue: List<String>)

}