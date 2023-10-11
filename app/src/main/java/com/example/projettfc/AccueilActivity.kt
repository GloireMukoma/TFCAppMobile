package com.example.projettfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccueilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)
        supportActionBar?.hide() // Masquer l'actionbar

        val button: Button = findViewById(R.id.nextBtnAcceuil)

        // Redirection lorsqu'on vers la seconde page d'acceuil lorsqu'on clique sur le bouton
        button.setOnClickListener {
            val intent = Intent(this, AcceuilActivity2::class.java)
            startActivity(intent)
        }
    }
}