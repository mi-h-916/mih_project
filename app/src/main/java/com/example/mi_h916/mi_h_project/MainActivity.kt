package com.example.mi_h916.mi_h_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mi_h916.mi_h_project.SubActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val navigator = navigator()
            navigator.navigator(this,SubActivity::class.java as Class<Any>)
        }
    }
}
