package com.example.toto2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
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
        val baseline_visibility = findViewById<ImageView>(R.id.ivToogleAnswers)
        val ivToogleAnswers = findViewById<LinearLayout>(R.id.ivToogleAnswers)
        baseline_visibility.setOnClickListener {
            if (ivToogleAnswers.visibility== View.GONE){
                ivToogleAnswers.visibility=View.VISIBLE}

            else{ivToogleAnswers.visibility= View.GONE
        }
        }
    }
}