package com.example.myapplication777
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val title: TextView = view.findViewById(R.id.item_title)
    val description: TextView = view.findViewById(R.id.item_description)
}