package com.example.botsad

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000);
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
}