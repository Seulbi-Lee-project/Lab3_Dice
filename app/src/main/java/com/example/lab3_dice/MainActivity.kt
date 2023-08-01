package com.example.lab3_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv_number = findViewById<TextView>(R.id.tv_number)
        var btn_roll = findViewById<Button>(R.id.btn_roll)

        btn_roll.setOnClickListener {
            var random = Random
            var num = random.nextInt(6) + 1

            tv_number.text = num.toString()
        }
    }
}