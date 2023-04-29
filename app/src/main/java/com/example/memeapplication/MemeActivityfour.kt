package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivityfour : AppCompatActivity() {
    lateinit var backarrowthree:TextView
    lateinit var forwardArrowFour:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_activityfour)
        backarrowthree = backarrowthree.findViewById(R.id.backarrowthree)
        backarrowthree.setOnClickListener {
            val back = Intent(this, MemeActivityThree::class.java)
            startActivity(back)
        }
        forwardArrowFour = forwardArrowFour.findViewById(R.id.tvnext3)
        forwardArrowFour.setOnClickListener {
            val intent = Intent(this,MemeActivityFive::class.java)
            startActivity(intent)
        }
    }
}