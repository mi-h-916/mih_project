package com.example.mi_h916.mi_h_project


import android.support.v4.app.Fragment
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mi_h916.mi_h_project.databinding.FragmentGridBinding
import com.example.mi_h916.mi_h_project.databinding.FragmentMainBinding

class GridFragment :Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGridBinding>(inflater,R.layout.fragment_grid,container,false).apply {
            val list = mutableListOf<String>("a","b","c","d")
            recyclerView.layoutManager = GridLayoutManager(activity,2)
            recyclerView.adapter = GridAdapter(list)
            recyclerView.addItemDecoration(GridDecoration(8))
//            recyclerView.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        }
        return binding.root
    }
}