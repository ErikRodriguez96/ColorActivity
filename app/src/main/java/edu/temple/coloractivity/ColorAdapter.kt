package edu.temple.coloractivity;

import android.graphics.Color
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView

public class ColorAdapter(_items: Array<ColorObject>) : RecyclerView.Adapter<ColorAdapter.ColorViewHolder>() {

    val items = _items

    class ColorObjectViewHolder(_view: View) : RecyclerView.ViewHolder(_view){
        val colorNameTextView = _view.findViewById<TextView>(R.id.colorNameTextView)
        val colorDisplayView = _view.findViewById<View>(R.id.colorDisplayView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColorAdapter.ColorViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.color_object_layout, parent, false)

        val ViewHolder = ColorObjectViewHolder(layout)
        return ViewHolder
    }

    override fun onBindViewHolder(holder: ColorAdapter.ColorViewHolder, position: Int) {
        holder.colorNameTextView.text = items[position].name
        holder.colorDisplayView.setBackgroundColor(Color.parseColor(items[position].code))
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
