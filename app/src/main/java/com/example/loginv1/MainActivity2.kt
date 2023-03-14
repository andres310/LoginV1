package com.example.loginv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()

        // Recupera datos del intent y los valida
        val user = this.intent.getStringExtra("user")
        val password = this.intent.getStringExtra("password")
        // Recupera texto
        val txt = findViewById<TextView>(R.id.resultTxt)

        if (user.equals("user1") && password.equals("user1")) {
            txt.setText("Welcome ${user}!")
        } else {
            txt.setText("Access Denied!")
        }
    }
}