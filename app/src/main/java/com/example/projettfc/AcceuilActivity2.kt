package com.example.projettfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuLoginId ->{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.menuAboutId ->{
                Toast.makeText(this, "Item more clicked", Toast.LENGTH_LONG).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }
}