package com.example.myprofile.adapters
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.R

class WalkthroughPagerAdapter(
    private val layouts: List<Int>,
    private val onLastPageButtonClick: () -> Unit
) : RecyclerView.Adapter<WalkthroughPagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position == layouts.size - 1) {
            holder.button?.visibility = View.VISIBLE
            holder.button?.setOnClickListener {
                onLastPageButtonClick()
            }
        } else {
            holder.button?.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int = layouts.size

    override fun getItemViewType(position: Int): Int = layouts[position]

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val button: Button? = view.findViewById(R.id.button_finish)
    }
}
