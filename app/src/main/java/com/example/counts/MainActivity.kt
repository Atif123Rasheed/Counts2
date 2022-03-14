package com.example.counts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // count app function

        val click_me = findViewById(R.id.push) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        click_me.setOnClickListener{
            timesClicked = timesClicked + 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "count clicked", Toast.LENGTH_SHORT).show()

        }
    }
}