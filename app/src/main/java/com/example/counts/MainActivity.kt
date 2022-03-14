package com.example.counts

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var mediaPlayer: MediaPlayer? = null
        val click_me = findViewById(R.id.push) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0

        click_me.setOnClickListener{
            mediaPlayer = MediaPlayer.create(this, R.raw.button)
            mediaPlayer?.start()
            timesClicked = timesClicked + 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "count clicked", Toast.LENGTH_SHORT).show()
        }
    }
}