package com.example.powerpuffapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, WelcomeFragment())
                .commit()
        }

        // Configura os cliques nas imagens dos personagens
        val floraImage = findViewById<ImageView>(R.id.image_flora)
        val lindaImage = findViewById<ImageView>(R.id.image_linda)
        val docinhoImage = findViewById<ImageView>(R.id.image_docinho)

        floraImage.setOnClickListener {
            // Troca para o fragmento da Florzinha
            replaceFragment(FlorzinhaFragment())
        }

        lindaImage.setOnClickListener {
            // Troca para o fragmento da Lindinha
            replaceFragment(LindinhaFragment())
        }

        docinhoImage.setOnClickListener {
            // Troca para o fragmento da Docinho
            replaceFragment(DocinhoFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        if (supportFragmentManager.findFragmentById(R.id.fragment_container) != null) {
            fragmentTransaction.add(R.id.fragment_container, fragment).addToBackStack(null)
        } else {
            fragmentTransaction.replace(R.id.fragment_container, fragment).addToBackStack(null)
        }

        fragmentTransaction.commit()
    }

    fun showMainContent() {
        val mainContentFragment = MainContentFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, mainContentFragment)
            .addToBackStack(null)
            .commit()
    }
}
