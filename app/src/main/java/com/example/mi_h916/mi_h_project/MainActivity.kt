package com.example.mi_h916.mi_h_project

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import com.example.mi_h916.mi_h_project.databinding.ActivityMainBinding
import android.view.animation.TranslateAnimation
import android.view.animation.AnimationSet





class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }

    private var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupFragment()
        binding.button.setOnClickListener {
            animateFadeOut(binding.animationArea)//setupSubFragment()
        }
    }

    fun setupFragment() {
        val fragment = MainFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(binding.container.id,fragment)
        transaction.commit()
    }

    fun setupSubFragment() {
        val fragment = SubFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(binding.container.id,fragment)
        transaction.commit()
    }

    fun animateFadeOut(target: View) {
        val animation_alpha = AlphaAnimation(1.0f,0.0f)
        animation_alpha.duration = 500

        val animation_trans = TranslateAnimation(target.x, 0f, 0f, 1000f)
        animation_trans.duration = 500

        val animation_set = AnimationSet(false)
        animation_set.addAnimation(animation_alpha)
        animation_set.addAnimation(animation_trans)

        animation_set.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationEnd(animation: Animation?) {
                animateFadeIn(target)
                target.visibility = View.GONE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationStart(animation: Animation?) {

            }

        })

        target.startAnimation(animation_set)

    }

    fun animateFadeIn(target: View) {
        val animation_alpha = AlphaAnimation(0.0f,1.0f)
        animation_alpha.duration = 300

        val animation_trans = TranslateAnimation(target.x, 0f, 1000f, 0f)
        animation_trans.duration = 300

        val animation_set = AnimationSet(false)
        animation_set.addAnimation(animation_alpha)
        animation_set.addAnimation(animation_trans)

        animation_set.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationEnd(animation: Animation?) {

            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationStart(animation: Animation?) {
                target.visibility = View.VISIBLE
                if(!flag) {
                    setupSubFragment()
                    flag = true
                }
                else {
                    setupFragment()
                    flag = false
                }
            }

        })

        target.startAnimation(animation_set)
    }

}
