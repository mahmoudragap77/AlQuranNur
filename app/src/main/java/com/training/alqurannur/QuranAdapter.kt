package com.training.alqurannur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.training.alqurannur.databinding.SurahItemBinding
import com.training.alqurannur.model.Data

class QuranAdapter(private var quranList: List<Data?>?, private val lisnter: SurahClickListener) :
    RecyclerView.Adapter<QuranAdapter.QuranViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): QuranViewHolder {
        return QuranViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.surah_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: QuranViewHolder, position: Int) {
        val currentItem = quranList?.get(position)
        holder.binding.surah = currentItem
        holder.binding.lisnter = lisnter

    }

    override fun getItemCount(): Int = quranList!!.size
    fun setItems(items: List<Data?>?) {
        quranList = items
    }

    class QuranViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = SurahItemBinding.bind(item)
    }

    interface SurahClickListener {
        fun onSurahClick(surah: Data)
    }
}