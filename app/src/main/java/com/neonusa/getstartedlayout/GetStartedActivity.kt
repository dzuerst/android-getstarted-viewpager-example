package com.neonusa.getstartedlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.neonusa.getstartedlayout.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = GetStartedViewPagerAdapter(this, this)
        TabLayoutMediator(binding.pageIndicator, binding.viewPager) { _, _ -> }.attach()

//        binding.textSkip.setOnClickListener {
//            finish()
//            val intent =
//                Intent(applicationContext, OnboardingFinishActivity::class.java)
//            startActivity(intent)
//            Animatoo.animateSlideLeft(this)
//        }

        val btnNextStep: Button = findViewById(R.id.btn_next_step)

        btnNextStep.setOnClickListener {
            if (getItem() > binding.viewPager.childCount) {
//                finish()
//                val intent =
//                    Intent(applicationContext, OnboardingFinishActivity::class.java)
//                startActivity(intent)
//                Animatoo.animateSlideLeft(this)
            } else {
                binding.viewPager.setCurrentItem(getItem() + 1, true)
            }
        }
    }

    private fun getItem(): Int {
        return binding.viewPager.currentItem
    }

}