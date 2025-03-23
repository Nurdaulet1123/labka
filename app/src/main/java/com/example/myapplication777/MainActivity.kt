package com.example.myapplication777

import android.widget.Toast


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ищем Toolbar вручную
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) // Устанавливаем как ActionBar

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val items = listOf(
            ItemModel("USA", "Population: 340.1 mil", R.drawable.flag_usa),
            ItemModel("JAPAN", "Population: 124.5 mil", R.drawable.flag_japan),
            ItemModel("ITALY", "Population: 58.99 mil", R.drawable.flag_italy)
        )

        val adapter = ItemAdapter(items) { item ->
            Toast.makeText(this, "Выбран: ${item.title} , ${item.description}", Toast.LENGTH_SHORT).show()
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}