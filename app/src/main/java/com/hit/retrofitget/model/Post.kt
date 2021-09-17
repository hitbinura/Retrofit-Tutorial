package com.hit.retrofitget.model

import com.google.gson.annotations.SerializedName

data class Post (

        val myUserId: Int,
        val id: Int,
        val title: String,
        val body: String

)