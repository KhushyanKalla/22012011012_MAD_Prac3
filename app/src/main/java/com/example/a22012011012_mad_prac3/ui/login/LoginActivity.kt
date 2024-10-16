package com.example.a22012011012_mad_prac3.ui.login

import android.app.Activity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a22012011012_mad_prac3.databinding.ActivityLoginBinding

import com.example.a22012011012_mad_prac3.R

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val email = intent.getStringExtra("email").toString()
        val pwd = intent.getStringExtra("password").toString()
        val emailIp = findViewById<EditText>(R.id.emailinput)
        val pwdIp = findViewById<EditText>(R.id.pwdinput)
        val loginbtn = findViewById<Button>(R.id.loginbtn)
        Log.i("email",email)
        Log.i("pwd",pwd)
        loginbtn.setOnClickListener {
            val emailinput = emailIp.text.toString()
            val pwdinput = pwdIp.text.toString()
            if (emailinput.isBlank()) {
                Toast.makeText(this, "Enter your email", Toast.LENGTH_SHORT).show()
            }
            else if (pwdinput.isBlank()) {
                Toast.makeText(this, "Enter your password", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}