package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class LindinhaInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lindinha_info)

        // Referências dos EditTexts e botão
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val editTextReason = findViewById<EditText>(R.id.editTextReason)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        // Listener para o botão de envio
        buttonSubmit.setOnClickListener {
            // Captura os dados
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()
            val reason = editTextReason.text.toString()

            // Adiciona as respostas no ResponseManager
            ResponseManager.addResponse(name, age, reason)

            // Inicia a ResponsesActivity
            val intent = Intent(this, ResponsesActivity::class.java)
            startActivity(intent)
        }
    }
}
