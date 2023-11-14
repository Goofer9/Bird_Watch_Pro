package com.example.Bird_Watch_Pro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        btn_login.setOnClickListener {
            loginUser()
        }

        tv_forgot_pw.setOnClickListener {
            resetPassword()
        }
    }

    private fun loginUser() {
        val email = et_email.text.toString()
        val password = et_password.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()) {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Login successful
                        // You can navigate to the next screen or perform other actions
                        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    } else {
                        // If login fails, display a message to the user.
                        Log.w("LoginActivity", "signInWithEmail:failure", task.exception)
                        Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                    }
                }
        } else {
            Toast.makeText(this, "Please enter both email and password", Toast.LENGTH_SHORT).show()
        }
    }

    private fun resetPassword() {
        val email = et_email.text.toString()

        if (email.isNotEmpty()) {
            auth.sendPasswordResetEmail(email)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(
                            this,
                            "Password reset email sent to $email",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Log.e("LoginActivity", "sendPasswordResetEmail:failure", task.exception)
                        Toast.makeText(
                            this,
                            "Failed to send password reset email",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        } else {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
        }
    }
}
