package com.example.mi_h916.mi_h_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.ArrayAdapter
import android.widget.TextView
import android.content.DialogInterface



class MainActivity : AppCompatActivity() {

    lateinit var alertDialog: AlertDialog
    private var Index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice)
        adapter.add("example1")
        adapter.add("example2")
        adapter.add("example3")
        adapter.add("example4")

        text.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("EXAMPLE_LIST")
            builder.setSingleChoiceItems(adapter,Index,onDialogClickListener )

            alertDialog = builder.create()
            alertDialog.window.attributes.windowAnimations = R.animator.fade_out
            alertDialog.show()
        }
    }

    private val onDialogClickListener = DialogInterface.OnClickListener { dialog, which ->
        // AlertDialogで選択された内容を保持
        Index = which
//        spinnerButton.setText(adapter.getItem(which))
        alertDialog.dismiss()
    }
}
