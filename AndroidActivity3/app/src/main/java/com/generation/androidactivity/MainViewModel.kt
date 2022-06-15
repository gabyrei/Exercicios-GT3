package com.generation.androidactivity

import android.icu.util.LocaleData
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.androidactivity.api.Repository
import com.generation.androidactivity.model.Categoria
import com.generation.androidactivity.model.Tarefa
import kotlinx.coroutines.launch
import java.net.ResponseCache
import java.nio.channels.MulticastChannel
import java.time.LocalDate

@HiltViewModel
   class MainViewModel @Inject constructor(
    private val repository = Repository

      ): ViewModel() {


    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse:LiveData<Response<List<Categoria>>>=
            _myCategoriaResponse

    private val _myTarefaResponse =
        MutableLiveData<Response<List<Tarefa>>>()

    val myTarefaResponse: LiveData<Response<List><Tarefa>>>()=
            _myTarefaResponse

    val dataSelecionada = MutableLiveData<LocalDate>()

    init {
       // listCategoria()
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

    fun addTarefa(tarefa: Tarefa) {
        viewModelScope.launch {
            try {
            val response= repository.addTarefa(tarefa)
                Log.d("opa",response.body().toString())
                listTarefa()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }
    fun listTarefa(){
        viewModelScope.launch {
            try {
                val reponse = repository.listTarefa()
                _myTarefaResponse.vulue= response
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }

        }
    }
}