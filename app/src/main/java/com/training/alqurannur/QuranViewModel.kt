package com.training.alqurannur

import android.widget.Toast
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

    private fun fetchSurah() {
        viewModelScope.launch {
            val response = repository.getQuran()
            if (!response.isNullOrEmpty()) {
                _surah.postValue(response)
            } else {

            }
            }
        }

    override fun onSurahClick(surah: Data) {
    }

}
