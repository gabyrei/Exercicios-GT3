package com.generation.androidactivity.api

import com.generation.androidactivity.model.Categoria
import retrofit2.http.Get
import java.net.ResponseCache

interface ApieService {

    @GET("categoria")
    suspend fun listCategoria: Response<List<Categoria>>


}