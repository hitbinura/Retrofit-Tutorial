package com.hit.retrofitget.repository

import android.graphics.PostProcessor
import com.hit.retrofitget.api.RetrofitInstance
import com.hit.retrofitget.model.Post

class repositary {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }

}