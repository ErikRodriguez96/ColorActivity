package edu.temple.coloractivity;

import android.graphics.Color
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView

public class ColorAdapter(_items: Array<ColorObject>, _myfunc: (ColorObject) -> Unit) : RecyclerView.Adapter<ColorAdapter.ColorObjectViewHolder>() {

    val items = _items
    val myOnClickFunc = _myfunc

    inner class ColorObjectViewHolder(_view: View) : RecyclerView.ViewHolder(_view){
        val colorNameTextView = _view.findViewById<TextView>(R.id.colorNameTextView)
        val colorDisplayView = _view.findViewById<View>(R.id.colorDisplayView)
        lateinit var colorObject : ColorObject

        init {
            _view.setOnClickListener{myOnClickFunc()}
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColorAdapter.ColorObjectViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.color_object_layout, parent, false)
        val ViewHolder = ColorObjectViewHolder(layout)
        return ViewHolder
    }

    override fun onBindViewHolder(holder: ColorAdapter.ColorObjectViewHolder, position: Int) {
        holder.colorNameTextView.text = items[position].name
        holder.colorDisplayView.setBackgroundColor(Color.parseColor(items[position].code))
        holder.colorObject = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
