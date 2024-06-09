package com.example.myprofile
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.R

class MusicVideoAdapter(private val items: List<String>) : RecyclerView.Adapter<MusicVideoAdapter.MusicVideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicVideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicVideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicVideoViewHolder, position: Int) {
        holder.musicVideoText.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MusicVideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val musicVideoImage: ImageView = itemView.findViewById(R.id.imageMusic)
        val musicVideoText: TextView = itemView.findViewById(R.id.nameMusic)
    }
}
