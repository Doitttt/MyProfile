package com.example.myprofile
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myprofile.adapters.WalkthroughPagerAdapter

class WalkthroughActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: WalkthroughPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)

        viewPager = findViewById(R.id.viewPager)
        val layouts = listOf(R.layout.walkthrough1, R.layout.walkthrough2, R.layout.walkthrough3)
        adapter = WalkthroughPagerAdapter(layouts) {
            navigateToMainActivity()
        }
        viewPager.adapter = adapter
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
