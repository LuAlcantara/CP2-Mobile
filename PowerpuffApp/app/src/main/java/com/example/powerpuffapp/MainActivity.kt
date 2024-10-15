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
                .add(R.id.fragment_container, WelcomeFragment())
                .commit()
        }

        val floraImage = findViewById<ImageView>(R.id.image_flora)
        val lindaImage = findViewById<ImageView>(R.id.image_linda)
        val docinhoImage = findViewById<ImageView>(R.id.image_docinho)

        floraImage.setOnClickListener {
            replaceFragment(FlorzinhaFragment())
        }

        lindaImage.setOnClickListener {
            replaceFragment(LindinhaFragment())
        }

        docinhoImage.setOnClickListener {
            replaceFragment(DocinhoFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun showMainContent() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainContentFragment())
            .addToBackStack(null)
            .commit()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}
