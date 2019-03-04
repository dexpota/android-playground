package me.destro.playground.android.datasources.typicode

import io.reactivex.Single
import me.destro.playground.android.datasources.typicode.model.User
import retrofit2.http.GET

interface TypicodeApi {
    @GET("/users")
    fun users(): Single<List<User>>
}