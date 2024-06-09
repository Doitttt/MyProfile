package com.example.myprofile
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.Music
import com.example.myprofile.MusicAdapter
import com.example.myprofile.R
import com.example.myprofile.VidAdapter
import com.example.myprofile.Video


class MusicVideoFragment : Fragment() {

    private lateinit var recyclerViewMusicFavorite: RecyclerView
    private lateinit var musicFavoriteAdapter: MusicAdapter
    private val musicItems = listOf(
        Music("Jvke - This is What Falling in Love Feels Like", R.drawable.jvke1, R.raw.this_is_what_falling_in_love_feels_like),
        Music("Jvke - This is What Autumn Feels Like", R.drawable.jvke2, R.raw.this_is_what_autumn_feels_like),
        Music("Polyphia - Playing God", R.drawable.playing_god, R.raw.playing_god),
        Music("Neckdeep - Wish you were here", R.drawable.neckdeep, R.raw.wish_you_were_here)
    )

    private lateinit var recyclerViewVideo: RecyclerView
    private lateinit var videoAdapter: VidAdapter
    private val videoItems = listOf(
        Video("Konosuba", R.drawable.konosuba,"Kono Subarashii Sekai ni Shukufuku wo!"),
        Video("Tensura", R.drawable.tensura," Tensei shitara Slime Datta Ken"),
        Video("High Card", R.drawable.highcard,"High Card")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_music_video, container, false)

        recyclerViewMusicFavorite = view.findViewById(R.id.recyclerViewMusicFavorite)
        recyclerViewMusicFavorite.layoutManager = LinearLayoutManager(context)
        musicFavoriteAdapter = MusicAdapter(musicItems)
        recyclerViewMusicFavorite.adapter = musicFavoriteAdapter

        recyclerViewVideo = view.findViewById(R.id.recyclerViewVideo)
        recyclerViewVideo.layoutManager = LinearLayoutManager(context)
        videoAdapter = VidAdapter(videoItems)
        recyclerViewVideo.adapter = videoAdapter

        return view
    }
}
