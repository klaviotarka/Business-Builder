package com.example.businessbuilder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddNotes : AppCompatActivity() {

    lateinit var button1: FloatingActionButton
    lateinit var button2: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_notes)

        button1 = findViewById(R.id.addNotesButton)
        button2 = findViewById(R.id.searchNotesButton)

        button1.setOnClickListener {
            val intent = Intent(this, NoteMenu::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {

        }

    }
}