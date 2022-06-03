package com.generation.aplicativodedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {
             Toast.makeText(this,"Clicou", Toast.LENGTH_LONG).show()
            var rolar= (6)


        }
        val buttonD12 = findViewById<Button>(R.id.buttonD12)

        buttonD6.setOnClickListener {
            Toast.makeText(this,"Clicou", Toast.LENGTH_LONG).show()
            var rolar= (12)
    }
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            Toast.makeText(this,"Clicou", Toast.LENGTH_LONG).show()
            var rolar= (20)

            private fun rolarDados (lados: Int,6,12,20){
                var rolar (1..Int)

            }            }
    }






