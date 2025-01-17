package com.example.myprofile.adapters
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
import com.example.myprofile.fragments.DailyActivityFragment

class FriendsAdapter(private val friendsList: List<DailyActivityFragment.Friend>) : RecyclerView.Adapter<FriendsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_friend, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friendsList[position]
        holder.bind(friend)
    }

    override fun getItemCount(): Int {
        return friendsList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.name_friend)
        private val imageImageView: ImageView = itemView.findViewById(R.id.image_friend)

        fun bind(friend: DailyActivityFragment.Friend) {
            nameTextView.text = friend.name
            imageImageView.setImageResource(friend.imageResource)
        }
    }
}
