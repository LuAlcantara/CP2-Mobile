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
        val editText = findViewById<EditText>(R.id.edit_text_reason)
        val buttonSubmit = findViewById<Button>(R.id.button_submit)

        when (characterName) {
            "Florzinha" -> {
                imageView.setImageResource(R.drawable.flor)
                textView.text = "Florzinha é a líder das Meninas Superpoderosas. " +
                        "\nCom cabelo vermelho e um vestido rosa, ela é determinada, corajosa e inteligente. " +
                        "\nFlorzinha possui superforça, voo e habilidades de combate. " +
                        "\nSua personalidade forte e senso de justiça a tornam uma defensora incansável da cidade, " +
                        "sempre pronta para enfrentar qualquer desafio ao lado de suas irmãs."
            }
            "Lindinha" -> {
                imageView.setImageResource(R.drawable.linda)
                textView.text = "Lindinha, uma das Meninas Superpoderosas, é a mais doce e sensível do trio. " +
                        "\nEla tem cabelo longo e usa um vestido azul. " +
                        "\nLindinha é gentil, otimista e possui habilidades como voo e superforça." +
                        "\nSua personalidade suave contrasta com a bravura de suas irmãs, e ela é frequentemente a voz da razão no grupo."
            }
            "Docinho" -> {
                imageView.setImageResource(R.drawable.docinho)
                textView.text = "Docinho, uma das Meninas Superpoderosas, é a mais destemida e agressiva das três irmãs. " +
                        "\nCom cabelo curto e vestido verde, ela possui superforça, velocidade e a capacidade de voar." +
                        "\nSua personalidade forte a leva a enfrentar vilões com coragem, sempre em união com Florzinha e Lindinha."
            }
        }

        // Configurar o botão para enviar a resposta
        buttonSubmit.setOnClickListener {
            val reason = editText.text.toString()
            if (reason.isNotBlank()) {
                ResponseManager.addResponse("Você gosta da $characterName porque: $reason")
                Toast.makeText(this, "Resposta enviada!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Por favor, insira uma resposta!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
