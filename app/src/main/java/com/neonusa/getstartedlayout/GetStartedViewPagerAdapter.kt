package com.neonusa.getstartedlayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class GetStartedViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val context: Context
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> GetStartedFragment.newInstance(
                context.resources.getString(R.string.title1),
                context.resources.getString(R.string.description_onboarding_1),
                R.raw.tasks
            )
            1 -> GetStartedFragment.newInstance(
                context.resources.getString(R.string.title2),
                context.resources.getString(R.string.description_onboarding_2),
                R.raw.reward
            )
            else -> GetStartedFragment.newInstance(
                context.resources.getString(R.string.title3),
                context.resources.getString(R.string.description_onboarding_3),
                R.raw.punishment
            )
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}