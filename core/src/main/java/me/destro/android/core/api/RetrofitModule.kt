package me.destro.android.core.api

import retrofit2.Retrofit

object RetrofitModule {
    fun create(baseUrl: String) = Retrofit.Builder().baseUrl(baseUrl).build()
}