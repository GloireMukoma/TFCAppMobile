package com.example.projettfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AcceuilActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceuil2)
        val button: Button = findViewById(R.id.nextBtnAcceuil2)

        // Redirection lorsqu'on vers la seconde page d'acceuil lorsqu'on clique sur le bouton
        button.setOnClickListener {
            val intent = Intent(this, AccueilActivity3::class.java)
            startActivity(intent)
        }

    }
}