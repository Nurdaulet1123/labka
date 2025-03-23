package com.example.myapplication777
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.itemTitle)
    val description: TextView = itemView.findViewById(R.id.itemDescription)
}