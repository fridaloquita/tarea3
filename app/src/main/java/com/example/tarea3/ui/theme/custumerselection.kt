package com.example.tarea3.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea3.MenuOpcionesActivity
import com.example.tarea3.R


class SeleccionClienteActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.custumerselection)

            findViewById<Spinner>(R.id.spinnerClientes)
            val btnContinuar = findViewById<Button>(R.id.btnContinuar)

            btnContinuar.setOnClickListener {
                // Navegar a la pantalla de Menú de Opciones
                val intent = Intent(this, MenuOpcionesActivity::class.java)
                startActivity(intent)
            }
        }
    }
