package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var fowardarrowOne :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nextMeme = findViewById<TextView>(R.id.fowardarrowOne)
        nextMeme.setOnClickListener {
            var intent = Intent(this,MemeActivityTwo::class.java)
            startActivity(intent)
        }
    }
}