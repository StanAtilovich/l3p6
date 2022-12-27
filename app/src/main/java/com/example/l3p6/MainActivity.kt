package com.example.l3p6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val likeButton = findViewById<ImageButton>(R.id.likes)
        likeButton.setImageResource(R.drawable.ic_baseline_favorite_24)


        val shareButton = findViewById<ImageButton>(R.id.shares)
        shareButton.setOnClickListener {

        }
    }
}