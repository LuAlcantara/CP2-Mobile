package com.example.powerpuffapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment

class MainContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_content, container, false)

        val floraImage = view.findViewById<ImageView>(R.id.image_flora)
        val lindaImage = view.findViewById<ImageView>(R.id.image_linda)
        val docinhoImage = view.findViewById<ImageView>(R.id.image_docinho)

        floraImage.setOnClickListener {
            replaceFragment(FlorzinhaFragment())
        }

        lindaImage.setOnClickListener {
            replaceFragment(LindinhaFragment())
        }

        docinhoImage.setOnClickListener {
            replaceFragment(DocinhoFragment())
        }

        return view
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()

    }
}
