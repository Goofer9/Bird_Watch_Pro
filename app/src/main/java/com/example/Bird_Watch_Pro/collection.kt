package com.example.Bird_Watch_Pro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.Bird_Watch_Pro.R.*

class Collection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val etFullness = findViewById<EditText>(id.et_fullname)
        val btnEditCollection = findViewById<Button>(id.btn_edit_collection)
        val btnViewOrCompareSpecies = findViewById<Button>(id.btn_view_species)

        btnEditCollection.setOnClickListener {
            val fullName = etFullness.text.toString()
            // Handle the "EDIT COLLECTION" button click
            Toast.makeText(this, "Editing collection for $fullName", Toast.LENGTH_SHORT).show()
        }

        btnViewOrCompareSpecies.setOnClickListener {
            // Handle the "VIEW OR COMPARE SPECIES" button click
            Toast.makeText(this, "Viewing or comparing species", Toast.LENGTH_SHORT).show()
        }
    }
}
