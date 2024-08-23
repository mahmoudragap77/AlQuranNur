package com.training.alqurannur
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.training.alqurannur.model.Data
import kotlinx.coroutines.launch

class QuranViewModel : ViewModel() , QuranAdapter.SurahClickListener {
    private val repository = QuranRepository()

    private val _surah = MutableLiveData<List<Data?>?>()
    val surah: LiveData<List<Data?>?> get() = _surah


    init {
        fetchSurah()
    }

    fun fetchSurah() {
        viewModelScope.launch {
            val response = repository.getQuran()
            if (response != null) {
                _surah.postValue(response)
                Log.d("TAG", "Surah data fetched successfully ${_surah.value}")
            } else {

            }
            }
        }

    override fun onSurahClick(surah: Data) {
    }

}
