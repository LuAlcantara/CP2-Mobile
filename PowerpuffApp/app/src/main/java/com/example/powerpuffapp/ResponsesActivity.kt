package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResponsesActivity : AppCompatActivity() {

    private lateinit var textResponses: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responses)

        textResponses = findViewById(R.id.text_responses)
        buttonBack = findViewById(R.id.button_back)

        val name = intent.getStringExtra("NAME") ?: "Desconhecido"
        val age = intent.getStringExtra("AGE") ?: "Desconhecido"
        val reason = intent.getStringExtra("REASON") ?: "Desconhecido"
        val character = intent.getStringExtra("CHARACTER") ?: "Desconhecido"

        val response = "Oi, $name, legal que você tem $age anos. E você gosta da $character porque ela é: $reason."
        textResponses.text = response

        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
