package com.hit.retrofitget.api


import com.hit.retrofitget.model.Post
import retrofit2.http.GET

interface SampleApi {

    @GET( "psts/1")
    suspend fun getPost(): Post

}