package com.example.myprofile
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myprofile.fragments.DailyActivityFragment
import com.example.myprofile.fragments.GalleryFragment
import com.example.myprofile.fragments.HomeFragment
import com.example.myprofile.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        // Load HomeFragment by default
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment = HomeFragment()
            when (item.itemId) {
                R.id.navigation_home -> selectedFragment = HomeFragment()
                R.id.navigation_daily_activity -> selectedFragment = DailyActivityFragment()
                R.id.navigation_gallery -> selectedFragment = GalleryFragment()
                R.id.navigation_music_video -> selectedFragment = MusicVideoFragment()
                R.id.navigation_profile -> selectedFragment = ProfileFragment()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit()
            true
        }
    }
}
