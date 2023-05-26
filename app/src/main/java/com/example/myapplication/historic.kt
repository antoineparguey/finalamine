package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.myapplication.avis




class historic : Fragment() {

lateinit var textimput : EditText
    private val listretout = mutableListOf<String>(
              "exelent ride",
        "very nice driver",
        "very good app",
        "happy to visit"
    )

    override fun toString(): String {
        return "previous review : \n \n ${listretout.joinToString("\n ") { it.toString() }}"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_historic, container, false)

        val button = view.findViewById<Button>(R.id.buttonback)

        val resultTextView: TextView = view.findViewById(R.id.textavis)
        resultTextView.text = toString()

        val btnajou = view.findViewById<Button>(R.id.btnajoutavis)
        textimput = view.findViewById<EditText>(R.id.ajoutavis)

        btnajou.setOnClickListener{
            listretout.add(textimput.getText().toString())
            val resultTextView: TextView = view.findViewById(R.id.textavis)
            resultTextView.text = toString()
        }

        button.setOnClickListener {

                view ->
            view.findNavController().navigate(R.id.action_historic_to_listetaxi)

        }
        return view
    }


}