package com.generation.androidactivity.api

import com.generation.androidactivity.model.Categoria
import com.generation.androidactivity.model.Tarefa
import java.net.ResponseCache

interface ApieService {

    @GET("categoria")
    suspend fun listCategoria: Response<List<Categoria>>

 @POST("tarefa")
 suspend fun addTarefa(
     @BODY tarefa: Tarefa
 ): Response<Tarefa>

 @GET("tarefa")
 suspend fun listTarefa(): Response<List<Tarefa>>

}