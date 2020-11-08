package com.example.androidcoredesafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.example.androidcoredesafio.ui.login.LoginActivity


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val runnable = {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        // depois de 5 segundos vai para tela de login
        Handler(Looper.getMainLooper()).postDelayed(runnable,5000)

    }
}
