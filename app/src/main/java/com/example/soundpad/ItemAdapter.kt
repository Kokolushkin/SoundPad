package com.example.soundpad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ItemAdapter(private val mDataList: ArrayList<Item>,
                  private val cellClickListener: CellClickListener) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_card_view, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.name.text = mDataList[position].name
        holder.image.setImageResource(R.drawable.default_image_card)

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        internal var name: TextView = itemView.findViewById<View>(R.id.name_group_of_sound) as TextView
        internal var image: ImageView = itemView.findViewById(R.id.image) as ImageView
    }
}