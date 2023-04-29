package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivityTwo : AppCompatActivity() {
    lateinit var backArrow:TextView
    lateinit var tvnext2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
    backArrow= findViewById(R.id.backArrow)
    backArrow.setOnClickListener {
        var intent =Intent(this, MainActivity::class.java )
        startActivity(intent)
    }
    tvnext2 = findViewById(R.id.tvnext2)
    tvnext2.setOnClickListener {
        var intent = Intent(this, MemeActivityThree::class.java)
        startActivity(intent)
    }

    }
}