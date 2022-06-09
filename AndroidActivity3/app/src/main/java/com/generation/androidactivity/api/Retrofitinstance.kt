package com.generation.androidactivity.api

import com.generation.androidactivity.util.Constants

object Retrofitinstance {

    private var retrofit by lazy {
        Retrofiti.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactry.create.())
            .build()
    }

    var api: ApieService by lazy {
        retrofit.create(ApieService::class.java)
    }
}