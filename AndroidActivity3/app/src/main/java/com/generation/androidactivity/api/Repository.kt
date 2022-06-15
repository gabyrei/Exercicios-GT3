package com.generation.androidactivity.api

import com.generation.androidactivity.model.Tarefa
import java.net.ResponseCache

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return Retrofitinstance.api.listCategoria()

    }

    suspend fun addTarefa(add: Tarefa): Response<Tarefa>{
        return Retrofitinstance.api.addTarefa(tarefa)

    }

    suspend fun listTarefa(): Response<List<Tarefa>>{
        return Retrofitinstance.api.listTarefa()
    }
}