package com.training.alqurannur

import android.annotation.SuppressLint
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.training.alqurannur.model.Data

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("items")
fun setItems(view :RecyclerView ,items :List<Data?>?){
    val adapter = view.adapter as QuranAdapter
    if (items != null){
        adapter.setItems(items)
        adapter.notifyDataSetChanged()
    }
    else{
        adapter.setItems(emptyList())
    }
}

@BindingAdapter("app:showLoading")
fun <T> showLoading(view : View, state :State<T?>?){
    if (state is State.Loading){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}
@BindingAdapter("app:showError")
fun <T> showError(view : View, state :State<T?>?){
    if (state is State.Error){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}
@BindingAdapter("app:showSuccess")
fun <T> showSuccess(view : View, state :State<T?>?){
    if (state is State.Success){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}