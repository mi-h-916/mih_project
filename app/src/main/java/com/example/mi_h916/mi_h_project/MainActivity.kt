package com.example.mi_h916.mi_h_project

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mi_h916.mi_h_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupFragment()
    }

    fun setupFragment() {
//        val fragment = MainFragment()
        val fragment = GridFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(binding.container.id,fragment)
        transaction.commit()
    }
}
