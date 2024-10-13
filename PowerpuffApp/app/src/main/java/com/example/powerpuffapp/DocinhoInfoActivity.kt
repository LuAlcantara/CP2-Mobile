package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DocinhoInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_docinho_info)


        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val editTextReason = findViewById<EditText>(R.id.editTextReason)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)


        buttonSubmit.setOnClickListener {

            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()
            val reason = editTextReason.text.toString()


            val intent = Intent(this, ResponsesActivity::class.java)


            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("REASON", reason)
            intent.putExtra("CHARACTER", "Docinho")


            startActivity(intent)
        }
    }
}
