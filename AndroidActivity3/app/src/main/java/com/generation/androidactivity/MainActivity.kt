package com.generation.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}