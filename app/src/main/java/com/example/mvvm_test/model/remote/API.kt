package com.example.mvvm_test.model.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
    val cocktailApi: Service by lazy{
        initRetrofit()
    }
}

private fun initRetrofit(): Service{
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(Service::class.java)

}