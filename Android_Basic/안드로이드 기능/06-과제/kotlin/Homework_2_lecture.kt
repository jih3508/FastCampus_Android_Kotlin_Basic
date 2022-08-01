package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged
import java.lang.Exception

class Homework_2_lecture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework2_lecture)

        val webView = findViewById<WebView>(R.id.webveiw)
        webView.setWebViewClient(object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?, request: WebResourceRequest?)
            : Boolean {
                return false
            }
        })

        try{
            webView.loadUrl(intent.data!!.toString())
        } catch (excetoion: Exception){

        }

        val address = findViewById<EditText>(R.id.address)

        val urlPreFix = "http://"
        var finalUrl = ""
        address.addTextChangedListener(object : TextWatcher{

            override fun beforeTextChanged(s: CharSequence?, start: Int, count : Int, after: Int) {
                Log.d("testt", "beforeTextChanged : " +  s)
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("testt", "onTextChanged : " +  s)
            }

            override fun afterTextChanged(s: Editable?) {
                finalUrl =urlPreFix + s.toString()
                Log.d("testt", "afterTextChanged : " +  s)
            }
        })

        // addTextChangedListner 사용법 -> 람다 형식
        address.doBeforeTextChanged {text, start, count, after ->  }
        address.doOnTextChanged{text, start, before, count ->  }
        address.doAfterTextChanged {  }

        val open = findViewById<TextView>(R.id.open)
        open.setOnClickListener{
            var url = address.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)

        }
    }
}