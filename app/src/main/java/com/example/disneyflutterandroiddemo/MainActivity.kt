package com.example.disneyflutterandroiddemo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.contentText).setOnClickListener {
            startActivity(Intent(baseContext, MainFlutterActivity::class.java))
        }
    }
}