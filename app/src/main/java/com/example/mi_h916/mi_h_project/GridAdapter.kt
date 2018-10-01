package com.example.mi_h916.mi_h_project

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mi_h916.mi_h_project.databinding.FragmentGridItemBinding

class GridAdapter(val data: MutableList<String>): RecyclerView.Adapter<GridAdapter.ItemHolder>(){

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder:ItemHolder, position: Int) {
        holder.binding.button.text = data[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ItemHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_grid_item,parent,false)
        return ItemHolder(v)
    }

    class ItemHolder(v: View):RecyclerView.ViewHolder(v) {
        val binding = DataBindingUtil.bind<FragmentGridItemBinding>(v)!!
    }
}