package com.example.myprofile.fragments
// Tanggal Pengerjaan : 09 Juni 2024
// Nama : Andriyanto Ryan Pramudipta
// Kelas : PEM-ANDRO-3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.R
import com.example.myprofile.adapters.DailyActivityAdapter
import com.example.myprofile.adapters.FriendsAdapter

class DailyActivityFragment : Fragment() {

    // Dummy list of friends
    private val friendsListItems = listOf(
        Friend("Bambang", R.drawable.ic_friend_placeholder),
        Friend("Eric", R.drawable.ic_friend_placeholder),
        Friend("Refaldi", R.drawable.ic_friend_placeholder),
        Friend("Reynaldi", R.drawable.ic_friend_placeholder),
        Friend("Fakhmy", R.drawable.ic_friend_placeholder),
        Friend("Sayid", R.drawable.ic_friend_placeholder),
        Friend("Gilang", R.drawable.ic_friend_placeholder),
        Friend("Berlian", R.drawable.ic_friend_placeholder),
        Friend("Arya", R.drawable.ic_friend_placeholder),
        Friend("Rafli", R.drawable.ic_friend_placeholder),
        Friend("Ravi", R.drawable.ic_friend_placeholder)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_daily_activity, container, false)

        // Setup RecyclerView for daily activities
        val dailyActivityList = view.findViewById<RecyclerView>(R.id.daily_activity_list)
        dailyActivityList.layoutManager = LinearLayoutManager(context)

        // Dummy data for daily activities
        val activities = listOf(
            Aktivitas("Bangun Tidur",R.drawable.ic_bangun),
            Aktivitas("Daily Games",R.drawable.ic_games),
            Aktivitas("Sarapan",R.drawable.ic_sarapan),
            Aktivitas("Mandi",R.drawable.ic_mandi),
            Aktivitas("Kuliah",R.drawable.ic_kampus),
            Aktivitas("Jalan - Jalan Setelah Kuliah",R.drawable.ic_jalan2),
            Aktivitas("Pulang",R.drawable.ic_pulang),
            Aktivitas("Tidur",R.drawable.ic_tidur)


        )

        // Set adapter for daily activity list
        dailyActivityList.adapter = DailyActivityAdapter(activities)

        // Setup RecyclerView for friends list
        val recyclerViewFriendsList = view.findViewById<RecyclerView>(R.id.recyclerViewFriendsList)
        recyclerViewFriendsList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewFriendsList.adapter = FriendsAdapter(friendsListItems)

        return view
    }

    // Data class for friends
    data class Friend(val name: String, val imageResource:Int)

    data class Aktivitas(
        val text: String,
        val imageResId: Int
    )


}
