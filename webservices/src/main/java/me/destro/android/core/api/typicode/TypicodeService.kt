package me.destro.android.core.api.typicode

import retrofit2.Retrofit

object TypicodeService {
    fun create(retrofit: Retrofit): TypicodeApi = retrofit.create(TypicodeApi::class.java)
}