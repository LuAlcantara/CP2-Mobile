package com.example.cp1_mobile_application_development

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaTres : AppCompatActivity() {
    lateinit var buttonLindinha: Button
    lateinit var buttonFlorzinha: Button
    lateinit var buttonHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_tres)

        buttonHome = findViewById(R.id.btnHome2)
        buttonHome.setOnClickListener {
            val navegarHome = Intent(this, MainActivity::class.java)
            startActivity(navegarHome)
        }

        buttonLindinha = findViewById(R.id.btnLindinha2)
        buttonLindinha.setOnClickListener {
            val navegarLindinha = Intent(this, TelaDois::class.java)
            startActivity(navegarLindinha)
        }

        buttonFlorzinha = findViewById(R.id.btnFlorzinha3)
        buttonFlorzinha.setOnClickListener {
            val navegarFlorzinha = Intent(this, TelaInformacoes::class.java)
            startActivity(navegarFlorzinha)

        }
    }
}
