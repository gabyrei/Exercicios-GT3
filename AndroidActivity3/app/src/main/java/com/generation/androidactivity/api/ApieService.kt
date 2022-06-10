package com.generation.androidactivity.api

import com.generation.androidactivity.model.Categoria

interface ApieService {

    @GET("categoria")
    suspend fun listCategoria: Response<List<Categoria>>


}