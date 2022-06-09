package com.generation.androidactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.androidactivity.model.Categoria
import kotlinx.coroutines.launch
import java.net.ResponseCache
import java.nio.channels.MulticastChannel

class MainViewModel: ViewModel() {

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse:LiveData<Response<List<Categoria>>>=
            _myCategoriaResponse

    fun listCategoria() {
        viewModelScope.launch {

            _myCategoriaResponse.value =
        }
    }
    }
}