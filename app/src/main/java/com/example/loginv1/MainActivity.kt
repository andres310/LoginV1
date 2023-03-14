package com.example.loginv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        // Obtiene los datos
        val user = findViewById<TextView>(R.id.userTxt)
        val password = findViewById<TextView>(R.id.passwordTxt)
        val btn = findViewById<Button>(R.id.button) // boton

        btn.setOnClickListener {
            // Manda datos a la siguiente vista
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("user", user.text.toString())
            intent.putExtra("password", password.text.toString())
            startActivity(intent)
        }
    }
}