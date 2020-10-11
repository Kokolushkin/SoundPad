package com.example.soundpad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class SoundCardAdapter(private val cellClickListener: CellClickListener):
    RecyclerView.Adapter<SoundCardAdapter.SoundViewHolder>()  {

    private var mDataList = listOf<Sound>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundCardAdapter.SoundViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sound_card_view, parent, false)
        return SoundViewHolder(view)
    }

    override fun onBindViewHolder(holder: SoundCardAdapter.SoundViewHolder, position: Int) {
        holder.name.text = mDataList[position].name

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    fun setSoundList(list: List<Sound>){
        this.mDataList = list
        notifyDataSetChanged()
    }

    inner class SoundViewHolder(soundView: View) : RecyclerView.ViewHolder(soundView){
        internal var name: TextView = itemView.findViewById<View>(R.id.name_of_sound) as TextView
    }
}