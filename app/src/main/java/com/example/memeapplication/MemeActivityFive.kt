package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivityFive : AppCompatActivity() {
    lateinit var backArrowFive:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_five)
    backArrowFive = backArrowFive.findViewById(R.id.backArrowFive)
    backArrowFive.setOnClickListener {
        var intent = Intent(this,MemeActivityfour::class.java)
        startActivity(intent)
    }
    }
}