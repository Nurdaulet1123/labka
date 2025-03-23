package com.example.myapplication777

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            ItemModel("Заголовок 1", "Описание 1"),
            ItemModel("Заголовок 2", "Описание 2"),
            ItemModel("Заголовок 3", "Описание 3")
        )

        recyclerView.adapter = ItemAdapter(items)
    }
}