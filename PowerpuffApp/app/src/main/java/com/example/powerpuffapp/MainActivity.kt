package com.example.powerpuffapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.powerpuffapp.ui.theme.PowerpuffAppTheme
import android.content.Intent
import android.widget.Button
import android.widget.ImageView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Imagens
        findViewById<ImageView>(R.id.image_flora).setOnClickListener {
            openCharacterDetail("Florzinha")
        }
        findViewById<ImageView>(R.id.image_linda).setOnClickListener {
            openCharacterDetail("Lindinha")
        }
        findViewById<ImageView>(R.id.image_docinho).setOnClickListener {
            openCharacterDetail("Docinho")
        }

        // Botão para ver respostas
        findViewById<Button>(R.id.button_respostas).setOnClickListener {
            val intent = Intent(this, ResponsesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openCharacterDetail(character: String) {
        val intent = Intent(this, CharacterDetailActivity::class.java)
        intent.putExtra("CHARACTER_NAME", character)
        startActivity(intent)
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PowerpuffAppTheme {
        Greeting("Android")
    }
}
}