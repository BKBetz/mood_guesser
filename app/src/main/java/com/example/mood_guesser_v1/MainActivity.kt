package com.example.mood_guesser_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sw = findViewById<Switch>(R.id.start_switch)

        sw.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked) {
                val nextPage = Intent(this@MainActivity, HomeActivity::class.java).apply {}
                startActivity(nextPage)
            }
        }
    }
//
//    fun switchpage() {
//
//    }
}