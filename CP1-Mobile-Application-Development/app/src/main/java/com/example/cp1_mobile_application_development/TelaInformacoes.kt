package com.example.cp1_mobile_application_development

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaInformacoes : AppCompatActivity() {
    lateinit var buttonLindinha: Button
    lateinit var buttonDocinho: Button
    lateinit var buttonHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_informacoes)

        buttonHome = findViewById(R.id.btnHome3)
        buttonHome.setOnClickListener {
            val navegarHome = Intent(this, MainActivity::class.java)
            startActivity(navegarHome)
        }

        buttonLindinha = findViewById(R.id.btnLindinha3)
        buttonLindinha.setOnClickListener{
            val navegarLindinha = Intent(this, TelaDois::class.java)
            startActivity(navegarLindinha)
        }

        buttonDocinho = findViewById(R.id.btnDocinho3)
        buttonDocinho.setOnClickListener(){
            val navegarDocinho= Intent(this, TelaTres::class.java)
            startActivity(navegarDocinho)
        }


    }
}