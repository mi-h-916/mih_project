package com.example.mi_h916.mi_h_project

import android.app.Activity
import android.content.Intent

class navigator {
    fun navigator(fromActivity: Activity,toActivity: Class<Any>) {
        val intent = Intent(fromActivity,toActivity)
        fromActivity.startActivity(intent)
    }
}