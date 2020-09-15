package com.example.l4s_skill_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://life-is-tech.com/materials/images/logo-square.png"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)

//        val imageView = findViewById<ImageView>(R.id.imageView)
//        imageView.setImageResource(R.drawable.sample)
    }
}