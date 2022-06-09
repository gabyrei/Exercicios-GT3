package com.generation.androidarquitetura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {  
    
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    class ActivityMainBinding {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)

        mainViewModel.cont.observe(this){
            binding.textResultado.tex = it.toString()
        }


        binding.buttonClique.setcClickListner{
          mainViewModel.addNum()
    }

}


}
