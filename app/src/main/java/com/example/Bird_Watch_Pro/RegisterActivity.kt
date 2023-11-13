package com.example.Bird_Watch_Pro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize your views
        val tvRegisterTitle = findViewById<TextView>(R.id.tv_register_title)
        val tvRegisterSubTitle = findViewById<TextView>(R.id.tv_register_sub_title)
        val tilFullName = findViewById<TextInputLayout>(R.id.til_fullname)
        val etFullName = findViewById<TextInputEditText>(R.id.et_fullname)
        val tilEmail = findViewById<TextInputLayout>(R.id.til_email)
        val etEmail = findViewById<TextInputEditText>(R.id.et_email)
        val tilUsername = findViewById<TextInputLayout>(R.id.til_username)
        val etUsername = findViewById<TextInputEditText>(R.id.et_username)
        val btnRegister = findViewById<AppCompatButton>(R.id.btn_register)
        val tvHaveAccount = findViewById<TextView>(R.id.tv_have_account)

        // Add any additional setup or logic you need here

        // Example: Setting a click listener for the register button
        btnRegister.setOnClickListener {
            // Perform registration logic here
        }
    }
}
