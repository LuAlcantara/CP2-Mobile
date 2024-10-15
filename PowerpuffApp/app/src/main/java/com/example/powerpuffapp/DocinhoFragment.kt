package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class DocinhoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_docinho, container, false)

        val editTextName = view.findViewById<EditText>(R.id.editTextName)
        val editTextAge = view.findViewById<EditText>(R.id.editTextAge)
        val editTextReason = view.findViewById<EditText>(R.id.editTextReason)
        val buttonSubmit = view.findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()
            val reason = editTextReason.text.toString()

            val intent = Intent(activity, ResponsesActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("REASON", reason)
            intent.putExtra("CHARACTER", "Docinho")

            startActivity(intent)
        }

        return view
    }
}
