package com.example.myprofile.fragments
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myprofile.R

class ProfileFragment : Fragment() {
    private lateinit var gfgImageButton1: ImageButton
    private lateinit var gfgButtonFindme: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        gfgImageButton1 = view.findViewById(R.id.btn_insta)
        gfgButtonFindme = view.findViewById(R.id.btn_findme)

        view.findViewById<TextView>(R.id.t_phone).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:083824663106")
            startActivity(intent)
        }

        view.findViewById<TextView>(R.id.t_mail).setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:andriantoryan85@gmail.com")
            startActivity(intent)
        }

        gfgImageButton1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/andriyantoryan14/"))
            startActivity(intent)
        }

        gfgButtonFindme.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/RDQER5GVvNUrNcN9A"))
            startActivity(intent)
        }

        return view
    }
}
