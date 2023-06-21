package com.azhar.alquran.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.azhar.alquran.R

class MainMenuActivity : AppCompatActivity() {
    private lateinit var buttonClik : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        buttonClik = findViewById(R.id.btn)

        buttonClik.setOnClickListener{
            startActivity(
                Intent(
                    this@MainMenuActivity,
                    MainActivity::class.java
                )
            )
        }
    }
}