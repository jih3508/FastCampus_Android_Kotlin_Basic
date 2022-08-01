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

class Homework_2_me : AppCompatActivity() {

    lateinit var search : TextView
    lateinit var url: EditText
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework2_me)

        url = findViewById<EditText>(R.id.url)
        webView = findViewById<WebView>(R.id.web)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return false
            }
        }

        try {
            webView.loadUrl(intent.data!!.toString())
        }catch (exception : Exception){

        }

        var urlPrefix = "https://"
        var finalUrl = ""

        url.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("testt", "beforeTextChanged : " + s)
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("testt", "onTextChanged : " + s)
            }

            override fun afterTextChanged(s: Editable?) {
                finalUrl = urlPrefix + s.toString()
                Log.d("testt", "afterTextChanged : " + s)
            }
        })

        url.doBeforeTextChanged { text, start, count, after -> }
        url.doOnTextChanged { text, start, before, count -> }
        url.doAfterTextChanged { }

        search = findViewById<TextView>(R.id.search)
        search.setOnClickListener {
            var address = "https://" + url.text.toString()
            Log.d("testt", "goUrl : " + address)
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }


    }

}