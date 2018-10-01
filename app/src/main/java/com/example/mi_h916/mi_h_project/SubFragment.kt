package com.example.mi_h916.mi_h_project

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mi_h916.mi_h_project.databinding.FragmentMainBinding
import com.example.mi_h916.mi_h_project.databinding.FragmentSubBinding

class SubFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentSubBinding>(inflater,R.layout.fragment_sub,container,false)
        return binding.root
    }
}