package com.example.recyclerview_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_kotlin.R
import com.example.recyclerview_kotlin.models.Model
import kotlinx.android.synthetic.main.layout_blod_list_item.view.*

class AdapterRecyclerView : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Model> = ArrayList()

    fun submitList(list: List<Model>){
        items = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolders(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_blod_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolders ->{
            holder.bind(items.get(position))
        }
       }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolders constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val images:ImageView = itemView.image_V
        val title:TextView = itemView.text_V
        val author:TextView = itemView.text_Vv

        fun bind(model: Model){

            title.setText(model.title)
            author.setText(model.body)

//            val requestOptions = RequestOptions()
//                .placeholder(R.drawable.ic_launcher_background)
//                .error(R.drawable.ic_launcher_foreground)

            Glide.with(itemView.context)
                .load(model.image)
                .into(images)
        }
    }

}