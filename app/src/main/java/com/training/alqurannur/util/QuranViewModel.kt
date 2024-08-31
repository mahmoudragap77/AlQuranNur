package com.training.alqurannur.util
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.training.alqurannur.QuranAdapter
import com.training.alqurannur.State
import com.training.alqurannur.model.Data
import com.training.alqurannur.model.QuranResponse
import kotlinx.coroutines.launch

class QuranViewModel : ViewModel() , QuranAdapter.SurahClickListener {
    private val repository = QuranRepository()

    private val _surah = MutableLiveData<State<QuranResponse?>?>()
    val surah: LiveData<State<QuranResponse?>?> get() = _surah


    init {
        fetchSurah()
    }

    fun fetchSurah() {
        viewModelScope.launch {
           repository.getQuran().collect{
               if (it != null) {
                   _surah.postValue(it)
                   Log.d("TAG", "Surah data fetched successfully ${_surah.value}")
               } else {

               }
           }

            }
        }

    override fun onSurahClick(surah: Data) {
    }

}
