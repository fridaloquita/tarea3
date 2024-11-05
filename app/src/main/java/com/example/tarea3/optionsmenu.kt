package com.example.tarea3
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuOpcionesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.optionsmenu)

        val btnOpcion1 = findViewById<Button>(R.id.btnOpcion1)
        val btnOpcion2 = findViewById<Button>(R.id.btnOpcion2)

        btnOpcion1.setOnClickListener {
            // Agregar funcionalidad para la Opción 1
        }

        btnOpcion2.setOnClickListener {
            // Agregar funcionalidad para la Opción 2
        }
    }
}