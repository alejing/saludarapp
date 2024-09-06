package com.example.saludoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonHello = findViewById<Button>(R.id.buttonHello)
        val textViewHello = findViewById<TextView>(R.id.textViewHello)

        buttonHello.setOnClickListener {
            textViewHello.text = getString(
                R.string.tv_hello,
                editTextName.text.toString()
            )
        }
    }
}