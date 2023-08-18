package com.roynaldi19.dc4_02activitytransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.roynaldi19.dc4_02activitytransition.databinding.ActivityHeroBinding
import com.roynaldi19.dc4_02activitytransition.model.Hero

class HeroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupData()
    }

    private fun setupData() {
        val hero = intent.getParcelableExtra<Hero>("Hero") as Hero
        Glide.with(applicationContext)
            .load(hero.photo)
            .circleCrop()
            .into(findViewById(R.id.profileImageView))
        binding.nameTextView.text= hero.name
        binding.descTextView.text = hero.description
    }
}