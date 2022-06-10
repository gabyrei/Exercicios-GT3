package com.generation.androidactivity

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.androidactivity.api.Repository
import com.generation.androidactivity.model.Categoria
import kotlinx.coroutines.launch
import java.net.ResponseCache
import java.nio.channels.MulticastChannel

@HiltViewModel
   class MainViewModel @Inject constructor(
    private val repository = Repository

      ): ViewModel() {


    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse:LiveData<Response<List<Categoria>>>=
            _myCategoriaResponse

    init {
        listCategoria()
    }


    fun listCategoria() {
        viewModelScope.launch {

            try {
                val response = repository.listCategoria()
                myCategoriaResponse.value = response

        }catch (e: Exception){
                Log.d("erro", e.message.toString())
            }
    }
            
    }
}