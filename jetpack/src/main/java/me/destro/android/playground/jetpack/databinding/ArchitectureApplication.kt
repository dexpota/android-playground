package me.destro.android.playground.jetpack.databinding

import android.app.Application
import me.destro.android.core.api.RetrofitModule
import me.destro.android.core.api.typicode.TypicodeApi
import me.destro.android.core.api.typicode.TypicodeService
import retrofit2.Retrofit

class ArchitectureApplication : Application() {
    companion object {
        private var retrofit = RetrofitModule.create("https://jsonplaceholder.typicode.com/")
        var typicodeApi = TypicodeService.create(retrofit)
    }
}