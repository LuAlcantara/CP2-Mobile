package com.example.cp1_mobile_application_development

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
        lateinit var buttonLindinha: Button
        lateinit var buttonFlorzinha: Button
        lateinit var buttonDocinho: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




            buttonLindinha = findViewById(R.id.btnLindinha)
            buttonLindinha.setOnClickListener{
                val navegarLindinha = Intent(this, TelaDois::class.java)
                startActivity(navegarLindinha)
            }

            buttonFlorzinha = findViewById(R.id.btnFlorzinha)
            buttonFlorzinha.setOnClickListener {
                val navegarFlorzinha = Intent(this, TelaInformacoes::class.java)
                startActivity(navegarFlorzinha)
            }

            buttonDocinho = findViewById(R.id.btnDocinho)
            buttonDocinho.setOnClickListener(){
                val navegarDocinho= Intent(this, TelaTres::class.java)
                startActivity(navegarDocinho)
            }



        }
    }