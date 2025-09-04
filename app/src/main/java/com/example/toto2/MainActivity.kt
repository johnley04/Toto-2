package com.example.toto2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcard_Answer = findViewById<TextView>(R.id.flashcard_Answer)
        val reponse2 = findViewById<TextView>(R.id.reponse2)
        val reponse3 = findViewById<TextView>(R.id.reponse3)
        flashcard_Answer.setOnClickListener {
            Toast.makeText(this, "Mausaise reponse", Toast.LENGTH_SHORT).show()
        }
        reponse2.setOnClickListener {
            Toast.makeText(this, "Bonne reponse", Toast.LENGTH_SHORT).show()
        }
        reponse3.setOnClickListener {
            Toast.makeText(this, "Mauvaise reponse", Toast.LENGTH_SHORT).show()
        }
    }
}