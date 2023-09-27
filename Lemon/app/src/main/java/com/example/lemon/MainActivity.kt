package com.example.lemon

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        withLemon ()
    }
    private fun withLemon () {
        val sequenceButton: Button = findViewById(R.id.button)
        val gutsState : ImageView = findViewById (R.id.imageView)
        gutsState.setImageResource(R.drawable.guts_with_lemon)
        var mediaPlayer = MediaPlayer.create(this, R.raw.lemon)
        mediaPlayer.start()
        sequenceButton.setOnClickListener {
            eatingLemon ()
        }
    }
    private fun eatingLemon () {
        val sequenceButton: Button = findViewById(R.id.button)
        val gutsState : ImageView = findViewById (R.id.imageView)
        gutsState.setImageResource(R.drawable.guts_eating_lemon)
        var mediaPlayer = MediaPlayer.create(this, R.raw.munch)
        mediaPlayer.start()
        sequenceButton.setOnClickListener {
            tasting ()
        }
    }
    private fun tasting () {
        val sequenceButton: Button = findViewById(R.id.button)
        val gutsState : ImageView = findViewById (R.id.imageView)
        gutsState.setImageResource(R.drawable.guts)
        var mediaPlayer = MediaPlayer.create(this, R.raw.taste)
        mediaPlayer.start()
        sequenceButton.setOnClickListener {
            scream ()
        }
    }
    private fun scream () {
        val sequenceButton: Button = findViewById(R.id.button)
        val gutsState : ImageView = findViewById (R.id.imageView)
        gutsState.setImageResource(R.drawable.guts_screaming)
        var mediaPlayer = MediaPlayer.create(this, R.raw.guts_scream_with_guts_theme)
        mediaPlayer.start()
        sequenceButton.setOnClickListener {
            mediaPlayer.stop()
            withLemon ()
        }
    }
}