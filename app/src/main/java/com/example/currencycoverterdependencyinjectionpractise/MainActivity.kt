package com.example.currencycoverterdependencyinjectionpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencycoverterdependencyinjectionpractise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

    }
}