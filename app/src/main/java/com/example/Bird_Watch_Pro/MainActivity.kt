package com.example.Bird_Watch_Pro

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            // Handle login button click
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_register.setOnClickListener {
            // Handle register button click
            Toast.makeText(this, "Register button clicked", Toast.LENGTH_SHORT).show()
            // You can navigate to the registration screen or perform other actions
        }
    }
}
