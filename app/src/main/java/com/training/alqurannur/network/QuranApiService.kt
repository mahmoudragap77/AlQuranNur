package com.training.alqurannur.network

import com.training.alqurannur.model.QuranResponse
import retrofit2.Response
import retrofit2.http.GET

interface QuranApiService {

    @GET("surah")
    suspend fun getQuran(): Response<QuranResponse>

}