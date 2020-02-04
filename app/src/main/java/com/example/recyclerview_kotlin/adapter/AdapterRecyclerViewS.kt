package com.example.recyclerview_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_kotlin.R
import com.example.recyclerview_kotlin.models.Model

class AdapterRecyclerViewS: RecyclerView.Adapter<ViewHolderS>() {

    private var model: List<Model> = ArrayList()

    fun submitList(list: List<Model>){
        model = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderS {
        return ViewHolderS(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blod_list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderS, position: Int) {
        holder.bind(model.get(position));
    }

    override fun getItemCount(): Int {
        return model.size;
    }
}