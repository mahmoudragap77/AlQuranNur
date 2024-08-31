package com.training.alqurannur.util

import android.util.Log
import com.training.alqurannur.State
import com.training.alqurannur.model.Data
import com.training.alqurannur.model.QuranResponse
import com.training.alqurannur.network.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class QuranRepository {
    fun getQuran(): Flow<State<QuranResponse?>?> {
        return wrapWithFlow(API.quranService::getQuran)
    }

    private fun <T>wrapWithFlow(function : suspend () -> Response<T>) : Flow<State<T?>?>{
        return flow {
            emit(State.Loading)
            try {
                val response = function()
                if (response.isSuccessful){
                    emit(State.Success(response.body()))
                }else{
                    emit(State.Error(response.message()))
                }
            }catch (e :Exception){
                emit(State.Error(e.message.toString()))
            }
        }
    }
}