package com.example.learningintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learningintent.databinding.ActivityMainBinding
import com.example.learningintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val name = intent.getStringExtra("Name",)
        val surname = intent.getStringExtra("Surname")

        binding.textViewName.text = "Name: $name"
        binding.textViewSurname.text = "Surname: $surname"

    }
}