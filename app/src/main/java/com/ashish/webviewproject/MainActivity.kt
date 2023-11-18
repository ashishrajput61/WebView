package com.ashish.webviewproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.link
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCricket:Button
    lateinit var btnFootball:Button
    lateinit var btnHockey:Button
    lateinit var btnKabbadi:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCricket=findViewById(R.id.btnCricket)
        btnFootball=findViewById(R.id.btnFootball)
        btnHockey=findViewById(R.id.btnHockey)
        btnKabbadi=findViewById(R.id.btnKabbadi)
        btnCricket.setOnClickListener {
          linkPath("https://www.cricbuzz.com/")
        }
        btnFootball.setOnClickListener {
            linkPath("https://www.football365.com/news")
        }
        btnHockey.setOnClickListener {
            linkPath("https://thehockeynews.com/")
        }
        btnKabbadi.setOnClickListener {
            linkPath("https://www.prokabaddi.com/news")
        }
    }

    private fun linkPath(url:String) {
       val i=Intent(this@MainActivity,StartActivity::class.java)
        i.putExtra("url",url)
        startActivity(i)
    }
}