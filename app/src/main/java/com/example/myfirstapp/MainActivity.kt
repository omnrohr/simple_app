package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBtn = findViewById<Button>(R.id.myBtn)
        var counter = 0
        val myText = findViewById<TextView>(R.id.textView)
        myText.text = counter.toString()
        myBtn.setOnClickListener {
            counter++;
            myText.text = counter.toString()
            Toast.makeText(this,"You increased the counter", Toast.LENGTH_LONG).show()
        }
    }
}