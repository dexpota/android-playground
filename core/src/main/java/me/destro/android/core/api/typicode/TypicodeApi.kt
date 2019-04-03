package me.destro.android.core.api.typicode

import io.reactivex.Single
import me.destro.android.core.api.typicode.model.User
import retrofit2.http.GET

interface TypicodeApi {
    @GET("/users")
    fun users(): Single<List<User>>
}