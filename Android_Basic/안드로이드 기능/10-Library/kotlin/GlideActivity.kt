package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        val imageView = findViewById<ImageView>(R.id.image)

        Glide.with(this)
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO9HRgR6OrbdGhKEjTA-TC8Dn8xo3n8T64KWg8aoR3&s")
            .fitCenter()
            .into(imageView);
    }
}