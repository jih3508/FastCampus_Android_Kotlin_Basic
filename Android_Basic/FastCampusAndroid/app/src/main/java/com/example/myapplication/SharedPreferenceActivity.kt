package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference사용법법
        findViewById<TextView>(R.id.create).setOnClickListener{
            //Create
            val sharedPreferences = getSharedPreferences("table_name", Context.MODE_PRIVATE)
            // MODE
            // MODE_PRIVAE → 현재 앱에서만 사용을 하겠다. → 다른 앱과 공유하지 않겠다.
            // MODE_WORLD_READBLE: 다른 앱에서도 사용가능 (읽기만 가능)
            // MODE_WORD_WRITABLE: 다른 앱에서도 사용가능 (앍기, 쓰기 가능)
            // MODE_MULTI_PROCESS: 이미 호출되어 사용중인지 체크
            // MODE_APPEND: 기존 preference에 신규로 추가
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1", "hello One") // key-value방식으로 데이터를 저장
            editor.putString("key2", "hello Two")
            editor.commit()
        }
        findViewById<TextView>(R.id.read).setOnClickListener{
            val sharedPreferences = getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val valueOne = sharedPreferences.getString("key1", "Wrong")
            val valueTwo = sharedPreferences.getString("key2", "Wrong")
            Log.d("testt", valueOne!!)
            Log.d("testt", valueTwo!!)
        }

        findViewById<TextView>(R.id.update).setOnClickListener{
            val sharedPreferences = getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1", "hello hello")
            editor.commit()
        }

        findViewById<TextView>(R.id.delete).setOnClickListener{
            val sharedPreferences = getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.clear()
            editor.commit()
        }
    }
}
