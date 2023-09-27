package com.example.teacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teacher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding= ActivityMainBinding.inflate(layoutInflater)
        binding.teacher.setOnClickListener{

        }
    }
}