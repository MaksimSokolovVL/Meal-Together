package com.example.mealtogether.home.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mealtogether.R
import com.example.mealtogether.home.presentation.viewmodel.HomeViewModel
import com.example.mealtogether.temp_list.ListAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var listAdapter: ListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val rvListItem = view?.findViewById<RecyclerView>(R.id.rv_list)
        listAdapter = ListAdapter()
        rvListItem?.adapter = listAdapter
    }
}