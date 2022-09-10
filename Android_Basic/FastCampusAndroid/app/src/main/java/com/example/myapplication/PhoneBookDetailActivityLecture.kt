package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PhoneBookDetailActivityLecture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_detail_lecture)

        val name = intent.extras?.getString("name") ?: ""
        val number = intent.extras?.getString("number") ?: ""

        findViewById<TextView>(R.id.name).text = name
        findViewById<TextView>(R.id.number).text = number

    }
}