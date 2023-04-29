package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivityThree : AppCompatActivity() {
    lateinit var backArrowTwo:TextView
    lateinit var ForwardArrowThree:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        backArrowTwo = backArrowTwo.findViewById(R.id.backArrowTwo)
        backArrowTwo.setOnClickListener {
            val back = Intent(this, MemeActivityTwo::class.java)
            startActivity(back)
        }
        ForwardArrowThree = ForwardArrowThree.findViewById(R.id.tvnext3)
        ForwardArrowThree.setOnClickListener {
            val intent = Intent(this,MemeActivityfour::class.java)
            startActivity(intent)
        }

    }

}