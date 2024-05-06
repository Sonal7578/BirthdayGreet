package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText // Declare EditText variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize nameInput by finding the view with id 'nameInput'
        nameInput = findViewById(R.id.nameInput)
    }

    fun createBirthdayCard(view: View) {

        val name = nameInput.editableText.toString()

        Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
    }
}