package com.hit.retrofitget

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hit.retrofitget.repository.repositary

class MainViewModelFactory(
        private val repositary: repositary):
        ViewModelProvider.Factory {


            override fun <T : ViewModel?> create(modelClass : Class<T>): T {
                return MainViewModel(repositary) as T

            }

}