package com.example.recyclerview_kotlin.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_kotlin.models.Model
import kotlinx.android.synthetic.main.layout_blod_list_item.view.*

class ViewHolderS(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image: ImageView = itemView.image_V
    val title: TextView = itemView.text_V
    val but: TextView = itemView.text_Vv

    fun bind(model: Model) {
        title.setText(model.title)
        but.setText(model.body)

        Glide.with(image.context)
            .load(model.image)
            .into(image)

    }

}
