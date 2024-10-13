package com.example.powerpuffapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CharacterDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_detail)

        val characterName = intent.getStringExtra("CHARACTER_NAME")

        val imageView = findViewById<ImageView>(R.id.image_character)
        val textView = findViewById<TextView>(R.id.text_character_info)
        val editTextReason = findViewById<EditText>(R.id.edit_text_reason)
        val editTextAge = findViewById<EditText>(R.id.edit_text_age) // Nova linha para pegar a idade
        val buttonSubmit = findViewById<Button>(R.id.button_submit)

        // Configuração do personagem
        when (characterName) {
            "Florzinha" -> {
                imageView.setImageResource(R.drawable.flor)
                textView.text = getString(R.string.florzinha_info)
            }
            "Lindinha" -> {
                imageView.setImageResource(R.drawable.linda)
                textView.text = getString(R.string.lindinha_info)
            }
            "Docinho" -> {
                imageView.setImageResource(R.drawable.docinho)
                textView.text = getString(R.string.docinho_info)
            }
        }

        // Botão para enviar a resposta
        buttonSubmit.setOnClickListener {
            val reason = editTextReason.text.toString()
            val age = editTextAge.text.toString() // Captura a idade do EditText
            if (reason.isNotBlank() && age.isNotBlank()) { // Verifica se ambos os campos estão preenchidos
                ResponseManager.addResponse(
                    getString(R.string.response_message, characterName, reason),
                    age, // Passa a idade correta
                    reason
                )
                Toast.makeText(this, R.string.response_sent, Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, R.string.empty_response_warning, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

