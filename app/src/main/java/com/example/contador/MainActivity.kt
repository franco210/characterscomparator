package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        classes()

    }

    private fun classes(){

        var compButton = findViewById<AppCompatButton>(R.id.compButton)
        var Text1 = findViewById<AppCompatEditText>(R.id.Text1)
        var Text2 = findViewById<AppCompatEditText>(R.id.Text2)
        var tvResults = findViewById<TextView>(R.id.tvResults)

        compButton.setOnClickListener(View.OnClickListener {
            val myBool: Boolean = false
            val respuesta = Comparador("${Text1.text.toString()}", "${Text2.text.toString()}", myBool)

            val result = respuesta.comp() // Obtén el resultado de la comparación

            tvResults.text = "${result}"
            // Toast.makeText(this@MainActivity, result, Toast.LENGTH_SHORT).show()
            Log.i("asd", "$result")
        })

    }
}

