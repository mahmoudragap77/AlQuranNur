package com.training.alqurannur

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.training.alqurannur.model.Data

@BindingAdapter("surahListItems")
fun setItems(view: RecyclerView,items: List<Data?>?) {
    val adapter = view.adapter as QuranAdapter
    if (items != null) {
        adapter.setItems(items)
        adapter.notifyDataSetChanged()
    }
    else{
        adapter.setItems(emptyList())
    }

}