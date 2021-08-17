package com.canhtv.ee.firebasechatapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.viewpager2.widget.ViewPager2
import com.canhtv.ee.firebasechatapp.R
import com.canhtv.ee.firebasechatapp.adapters.HomeFragmentAdapter
import com.canhtv.ee.firebasechatapp.utils.SessionController
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = listOf<String>("Conversation", "Contact")
        val viewPager = view.findViewById<ViewPager2>(R.id.pager)
        viewPager.adapter = HomeFragmentAdapter(this)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = title[position]
        }.attach()

    }
}