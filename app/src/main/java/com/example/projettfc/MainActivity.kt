package com.example.projettfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projettfc.fragments.AboutFragment
import com.example.projettfc.fragments.CatalogueFragment
import com.example.projettfc.fragments.OtherFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragement(CatalogueFragment(this))

        // import la barre de navigation
        val navigationView = findViewById<BottomNavigationView>(R.id.navigation_view)
        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.bnav_icon_catalg -> {
                    loadFragement(CatalogueFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.bnav_icon_other -> {
                    loadFragement(OtherFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.bnav_icon_about -> {
                    loadFragement(AboutFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun loadFragement(fragment: Fragment) {

        // Injecter le fragment dans notre boite(fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}