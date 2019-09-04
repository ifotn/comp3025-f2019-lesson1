package com.infrontofthenet.f2019_lesson1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName : EditText
    private lateinit var buttonMessage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // reference our editText and button views
        editTextName = findViewById(R.id.editTextName)
        buttonMessage = findViewById(R.id.buttonMessage)

        // create button onClick event handler
        buttonMessage.setOnClickListener {
            val name = editTextName.text
            val message = "Hello $name"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
