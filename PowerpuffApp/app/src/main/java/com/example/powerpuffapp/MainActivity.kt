package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência das imagens
        val imageLinda = findViewById<ImageView>(R.id.image_linda)
        val imageFlora = findViewById<ImageView>(R.id.image_flora)
        val imageDocinho = findViewById<ImageView>(R.id.image_docinho)

        // Listener para imagem da Lindinha
        imageLinda.setOnClickListener {
            val intent = Intent(this, LindinhaInfoActivity::class.java)
            startActivity(intent)
        }

        // Listener para imagem da Florzinha
        imageFlora.setOnClickListener {
            val intent = Intent(this, FlorzinhaInfoActivity::class.java)
            startActivity(intent)
        }

        // Listener para imagem da Docinho
        imageDocinho.setOnClickListener {
            val intent = Intent(this, DocinhoInfoActivity::class.java)
            startActivity(intent)
        }

        // Listener para o botão de respostas
        val buttonRespostas = findViewById<Button>(R.id.button_respostas)
        buttonRespostas.setOnClickListener {
            // Ação para o botão de respostas
        }
    }
}
