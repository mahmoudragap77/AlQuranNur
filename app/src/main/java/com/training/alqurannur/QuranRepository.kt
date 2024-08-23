package com.training.alqurannur

import android.util.Log
import com.training.alqurannur.model.Data
import com.training.alqurannur.network.API

class QuranRepository {
    // ...

    suspend fun getQuran(): List<Data?>? {
        Log.d("TAG", "getQuran called with ${API.quranService.getQuran().data?.size}")
        return API.quranService.getQuran().data
    }
}