package com.training.alqurannur

import android.util.Log
import com.training.alqurannur.model.Data
import com.training.alqurannur.network.API

class QuranRepository {
    // ...

    suspend fun getQuran(): List<Data?>? {
        return API.quranService.getQuran().data
    }
}