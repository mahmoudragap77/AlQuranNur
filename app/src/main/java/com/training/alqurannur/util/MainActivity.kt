package com.training.alqurannur.util

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.training.alqurannur.QuranAdapter
import com.training.alqurannur.R
import com.training.alqurannur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: QuranViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val adapter = QuranAdapter(mutableListOf(),viewModel)
        binding.recyclerView.adapter = adapter

//        viewModel.fetchSurah()
//        viewModel.surah.observe(this){
//            adapter.setItems(it)
//            adapter.notifyDataSetChanged()
//            Log.d("TAG",it.toString())
//        }

    }
    }
