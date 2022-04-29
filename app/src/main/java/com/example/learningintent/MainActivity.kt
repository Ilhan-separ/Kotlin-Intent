package com.example.learningintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.learningintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun next(view : View){

        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("Name",binding.editTextName.text.toString())
        intent.putExtra("Surname",binding.editTextSurname.text.toString())
        startActivity(intent)

    }



}