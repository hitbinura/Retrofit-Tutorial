package com.hit.retrofitget.api

import com.hit.retrofitget.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    }
    val api: SampleApi by lazy{
        retrofit.create(SampleApi::class.java)

    }


}