package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class CharacterListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.image_flora).setOnClickListener {
            openCharacterDetail("Florzinha")
        }
        view.findViewById<ImageView>(R.id.image_linda).setOnClickListener {
            openCharacterDetail("Lindinha")
        }
        view.findViewById<ImageView>(R.id.image_docinho).setOnClickListener {
            openCharacterDetail("Docinho")
        }

        view.findViewById<Button>(R.id.button_respostas).setOnClickListener {
            val intent = Intent(activity, ResponsesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openCharacterDetail(character: String) {
        val intent = Intent(activity, CharacterDetailActivity::class.java)
        intent.putExtra("CHARACTER_NAME", character)
        startActivity(intent)
    }
}
