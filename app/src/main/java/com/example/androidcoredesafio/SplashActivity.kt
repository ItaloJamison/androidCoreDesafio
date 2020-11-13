package com.example.androidcoredesafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val runnable = {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            finish()
        }
        // depois de 2 segundos vai para tela de login
        Handler(Looper.getMainLooper()).postDelayed(runnable,2000)

    }
}
