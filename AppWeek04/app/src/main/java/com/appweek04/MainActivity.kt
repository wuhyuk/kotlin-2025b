package com.appweek04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGreeting = findViewById<Button>(R.id.buttonGreeting)

        buttonGreeting.setOnClickListener {
            startActivity(Intent(this, GreetingActivity::class.java))
        }
    }
}