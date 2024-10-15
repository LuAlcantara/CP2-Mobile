package com.example.powerpuffapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adiciona o WelcomeFragment apenas se for a primeira criação
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, WelcomeFragment())
                .commit()
        }

        // Configura os cliques nas imagens dos personagens
        val floraImage = findViewById<ImageView>(R.id.image_flora)
        val lindaImage = findViewById<ImageView>(R.id.image_linda)
        val docinhoImage = findViewById<ImageView>(R.id.image_docinho)

        floraImage.setOnClickListener {
            // Troca para o fragmento da Florzinha
            replaceFragment(FlorzinhaFragment())
        }

        lindaImage.setOnClickListener {
            // Troca para o fragmento da Lindinha
            replaceFragment(LindinhaFragment())
        }

        docinhoImage.setOnClickListener {
            // Troca para o fragmento da Docinho
            replaceFragment(DocinhoFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        // Inicia a transação
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true) // Habilita a reordenação
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null) // Adiciona o fragmento à pilha de volta
        transaction.commit()
    }

    fun showMainContent() {
        // Substitua MainContentFragment pelo fragmento que deseja mostrar
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainContentFragment())
            .addToBackStack(null) // Adiciona à pilha de volta para permitir navegação
            .commit()
    }

    override fun onBackPressed() {
        // Se houver fragments na pilha, voltar para o anterior
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed() // Comportamento padrão se não houver fragments na pilha
        }
    }
}
