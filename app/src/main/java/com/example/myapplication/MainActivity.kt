package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tvSignUp: TextView
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSignUp = findViewById(R.id.tvSignUp)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btSignUp = findViewById(R.id.btSignUp)

        btSignUp.setOnClickListener {

            if (etEmail.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Your Email", Toast.LENGTH_LONG).show()
            }
            else if (etPassword.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Your Password", Toast.LENGTH_LONG).show()
            }
            else { tvSignUp.setTextColor(Color.RED) }

        }

    }
}
