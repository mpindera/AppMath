package com.example.mathforkids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnblue = findViewById<Button>(R.id.btnAddGame)
        val btnblack = findViewById<Button>(R.id.btnSubtractGame)

        btnblue.setOnClickListener {
            val intentBlue = Intent(this,MainActivityAddGame::class.java)
            startActivity(intentBlue)
            finish()
        }
        btnblack.setOnClickListener {
            val intentBlack= Intent(this,MainActivitySubtractGame::class.java)
            startActivity(intentBlack)
            finish()
        }
    }
}