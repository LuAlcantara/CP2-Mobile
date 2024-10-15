package com.example.powerpuffapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        val nextButton: Button = view.findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            (activity as MainActivity).showMainContent()
        }

        return view
    }
}
