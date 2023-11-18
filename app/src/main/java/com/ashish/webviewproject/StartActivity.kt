package com.ashish.webviewproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class StartActivity : AppCompatActivity() {
    lateinit var web_view: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        web_view = findViewById(R.id.web_view)
        val url = intent.getStringExtra("url")
        if (url != null) {
            web_view.loadUrl(url)
            web_view.webViewClient = WebViewClient()
            web_view.settings.javaScriptEnabled = true
        }
    }
    override fun onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack()
        } else {
            super.onBackPressed()
        }
    }
}