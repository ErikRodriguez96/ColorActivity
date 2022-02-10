package edu.temple.coloractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = arrayOf(
            ColorObject("Red", "#FF0000"),
            ColorObject("Green", "#FF0000"),
            ColorObject("Blue", "#FF0000"),
            ColorObject("Red", "#FF0000"),
            ColorObject("Red", "#FF0000"),
            ColorObject("Red", "#FF0000")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, )
    }
}