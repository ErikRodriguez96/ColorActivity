package edu.temple.coloractivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = arrayOf(
            ColorObject("Red", "#FF0000"),
            ColorObject("Green", "#00FF00"),
            ColorObject("Blue", "#0000FF"),
            ColorObject("Gray", "#555555"),
            ColorObject("Orange", "#FFA500"),
            ColorObject("Pink", "#33FFFF")
        )

        val myOnClickFunction : (ColorObject) -> Unit = {
            findViewById<View>(R.id.mainLayout).setBackgroundColor(Color.parseColor(it.code))
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = ColorAdapter(colors, myOnClickFunction)
    }
}