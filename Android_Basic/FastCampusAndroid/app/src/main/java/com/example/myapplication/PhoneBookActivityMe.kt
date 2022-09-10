package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat

class PhoneBookActivityMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_me)

        var profileList = mutableListOf<Profile>()
        for (i in 0..10){
            profileList.add(Profile("" + (i + 1) + "번째 사람", "010-1111-111" + i))
        }

        val container = findViewById<LinearLayoutCompat>(R.id.container)
        val inflater = LayoutInflater.from(this@PhoneBookActivityMe)
        profileList.forEach{
            val profileItemView = inflater.inflate(R.layout.phonebook_item_me, null)
            val profileImage = profileItemView.findViewById<ImageView>(R.id.profileImage)
            val nthPerson = profileItemView.findViewById<TextView>(R.id.nthPerson)
            val nthPhoneNumber = profileItemView.findViewById<TextView>(R.id.nthPhoneNumber)

            profileImage.setImageDrawable(resources.getDrawable(R.drawable.blue_backgrounde, this.theme))
            nthPerson.text = it.nthPerson
            nthPhoneNumber.text =it.nthPhoneNumber

            container.addView(profileItemView)

            profileItemView.setOnClickListener {

                var intent = Intent(this@PhoneBookActivityMe, PhoneBookDetailActivityMe::class.java)

                intent.putExtra("person", nthPerson.text)
                intent.putExtra("phoneNumber", nthPhoneNumber.text)

                startActivity(intent)
            }

        }

    }
}


class Profile(val nthPerson: String, val nthPhoneNumber: String)