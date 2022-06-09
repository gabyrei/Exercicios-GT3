package com.generation.androidactivity.api

import java.net.ResponseCache

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return Retrofitinstance.api.listCategoria()

    }
}