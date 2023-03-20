package com.example.lab32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab32.databinding.ActivityMainBinding
import com.example.lab32.databinding.ActivitySecondMainBinding

class SecondMainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}