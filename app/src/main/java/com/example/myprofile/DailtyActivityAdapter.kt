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

class DailyActivityAdapter(private val activities: List<DailyActivityFragment.Aktivitas>) : RecyclerView.Adapter<DailyActivityAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val activityImageView: ImageView = view.findViewById(R.id.activity_image)
        val activityTextView: TextView = view.findViewById(R.id.activity_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_daily_activity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val activity = activities[position]
        holder.activityImageView.setImageResource(activity.imageResId)
        holder.activityTextView.text = activity.text  // Ensure this is a String
    }

    override fun getItemCount() = activities.size
}
