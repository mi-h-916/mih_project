package com.example.mi_h916.mi_h_project

import android.support.v4.app.Fragment
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import com.example.mi_h916.mi_h_project.databinding.FragmentMainBinding

class MainFragment :Fragment(){

    private val list = listOf(5,10,15,20,25,30)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,R.layout.fragment_main,container,false).apply {
            text.setText(seekbar.progress.toString())

            seekbar.setOnSeekBarChangeListener(
                    object :SeekBar.OnSeekBarChangeListener {
                        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                            //ツマミをドラッグ
                            seekBar?.let {
                                val index = it.progress / list.size
                                text.setText(list.get(index).toString())
                            }
                        }

                        override fun onStartTrackingTouch(seekBar: SeekBar?) {
                            //ツマミを触れたとき
                        }

                        override fun onStopTrackingTouch(seekBar: SeekBar?) {
                            //ツマミを離した時
                        }
                    }
            )
        }
        return binding.root
    }
}