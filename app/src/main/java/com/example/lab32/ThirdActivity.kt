package com.example.lab32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab32.databinding.ActivityMainBinding
import com.example.lab32.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}