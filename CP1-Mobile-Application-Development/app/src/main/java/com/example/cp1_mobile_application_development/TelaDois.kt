package com.example.cp1_mobile_application_development

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaDois : AppCompatActivity() {
    lateinit var buttonHome: Button
    lateinit var buttonFlorzinha: Button
    lateinit var buttonDocinho: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_dois)

        buttonHome = findViewById(R.id.btnHome)
        buttonHome.setOnClickListener {
            val navegarHome = Intent(this, MainActivity::class.java)
            startActivity(navegarHome)
        }

        buttonFlorzinha = findViewById(R.id.btnFlorzinha2)
        buttonFlorzinha.setOnClickListener {
            val navegarFlorzinha = Intent(this, TelaInformacoes::class.java)
            startActivity(navegarFlorzinha)
        }

        buttonDocinho = findViewById(R.id.btnDocinho2)
        buttonDocinho.setOnClickListener(){
            val navegarDocinho= Intent(this, TelaTres::class.java)
            startActivity(navegarDocinho)
        }


    }
}