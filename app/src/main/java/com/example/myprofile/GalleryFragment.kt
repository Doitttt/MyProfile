package com.example.myprofile.fragments
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.R
import com.example.myprofile.adapters.GalleryAdapter

class GalleryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val galleryGrid = view.findViewById<RecyclerView>(R.id.gallery_grid)
        galleryGrid.layoutManager = GridLayoutManager(context, 3)

        // Dummy data
        val images = listOf(
            R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img8, R.drawable.img9
        )

        galleryGrid.adapter = GalleryAdapter(images)
        return view
    }
}
