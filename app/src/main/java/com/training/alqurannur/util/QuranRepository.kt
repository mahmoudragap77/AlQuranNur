package com.training.alqurannur.util

import android.util.Log
import com.training.alqurannur.State
import com.training.alqurannur.model.Data
import com.training.alqurannur.network.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuranRepository {
    suspend fun getQuran(): Flow<State<List<Data?>?>> {
        return flow {
            emit(State.Loading)
            try {
                val response = API.quranService.getQuran()
                if (response.isSuccessful){
                    emit(State.Success(response.body()?.data))
                }else{
                    emit(State.Error(response.message()))
                }
            }catch (e :Exception){
                emit(State.Error(e.message.toString()))
            }

        }
    }
}