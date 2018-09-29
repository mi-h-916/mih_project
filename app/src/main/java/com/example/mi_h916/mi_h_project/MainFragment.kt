package com.example.mi_h916.mi_h_project

import android.support.v4.app.Fragment
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mi_h916.mi_h_project.databinding.FragmentMainBinding

class MainFragment :Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,R.layout.fragment_main,container,false)
        return binding.root
    }
}