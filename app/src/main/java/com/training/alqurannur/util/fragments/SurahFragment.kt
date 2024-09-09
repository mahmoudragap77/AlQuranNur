package com.training.alqurannur.util.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.training.alqurannur.QuranAdapter
import com.training.alqurannur.R
import com.training.alqurannur.databinding.ActivityMainBinding
import com.training.alqurannur.databinding.FragmentSurahBinding
import com.training.alqurannur.util.QuranViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SurahFragment : Fragment() {
    lateinit var binding: FragmentSurahBinding
    private val viewModel: QuranViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentSurahBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val adapter = QuranAdapter(mutableListOf(),viewModel)
        binding.recyclerView.adapter = adapter

        binding.recyclerView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_surahFragment2_to_azanFragment)
        }
    }

}