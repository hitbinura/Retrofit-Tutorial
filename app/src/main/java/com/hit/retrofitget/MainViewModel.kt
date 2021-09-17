package com.hit.retrofitget

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hit.retrofitget.model.Post
import com.hit.retrofitget.repository.repositary
import kotlinx.coroutines.launch

class MainViewModel(private val repositary: repositary): ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response:Post = repositary.getPost()
            myResponse.value = response

        }

    }



}