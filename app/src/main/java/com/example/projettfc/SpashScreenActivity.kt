package com.example.projettfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SpashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME: Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() // Masquer l'actionbar

        setContentView(R.layout.activity_spash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            // Ferme l'activité d'écran de chargement
            finish()
        }, SPLASH_TIME)

    }
}