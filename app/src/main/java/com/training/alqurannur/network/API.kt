package com.training.alqurannur.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
    const val BASE_URL = "https://api.alquran.cloud/v1/"
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val quranService = retrofit.create(QuranApiService::class.java)


}