package com.example.powerpuffapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MainContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_main, container, false)

        val imageLinda = view.findViewById<ImageView>(R.id.image_linda)
        val imageFlora = view.findViewById<ImageView>(R.id.image_flora)
        val imageDocinho = view.findViewById<ImageView>(R.id.image_docinho)

        imageLinda.setOnClickListener {
            val intent = Intent(activity, LindinhaInfoActivity::class.java)
            startActivity(intent)
        }

        imageFlora.setOnClickListener {
            val intent = Intent(activity, FlorzinhaInfoActivity::class.java)
            startActivity(intent)
        }

        imageDocinho.setOnClickListener {
            val intent = Intent(activity, DocinhoInfoActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
