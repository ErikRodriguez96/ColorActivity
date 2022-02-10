package edu.temple.coloractivity;

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ColorAdapter(_items: Array<ColorObject>) : RecyclerView.Adapter<ColorAdapter.ColorViewHolder>() {

    val items = _items

    class ColorObjectViewHolder(_view: View) : RecyclerView.ViewHolder(_view){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColorAdapter.ColorViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.color_object_layout, parent)
    }

    override fun onBindViewHolder(holder: ColorAdapter.ColorViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size()
    }
}
