package com.example.powerpuffapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.powerpuffapp.ResponseManager

class ResponsesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responses)

        val textResponses = findViewById<TextView>(R.id.text_responses)
        val buttonBack = findViewById<Button>(R.id.button_back)

        // Exibir as respostas
        textResponses.text = ResponseManager.getAllResponses()

        buttonBack.setOnClickListener {
            finish() // Volta para a tela anterior
        }
    }
}
