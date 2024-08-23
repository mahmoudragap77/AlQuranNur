package com.training.alqurannur

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.training.alqurannur.databinding.ActivityMainBinding
import com.training.alqurannur.model.Data

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
