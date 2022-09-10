package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PhoneBookDetailActivityMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_detail_me)

        val intent = intent
        val person: String? = intent.extras?.getString("person")
        val phoneNumber: String? = intent.extras?.getString("phoneNumber")

        findViewById<TextView>(R.id.person).text = person
        findViewById<TextView>(R.id.phoneNumber).text = phoneNumber
    }
}