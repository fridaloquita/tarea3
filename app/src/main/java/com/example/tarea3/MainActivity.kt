package com.example.tarea3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea3.ui.theme.SeleccionClienteActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.index)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnIngresar.setOnClickListener {
            // Navegar a la pantalla de Selección de Cliente
            val intent = Intent(this, SeleccionClienteActivity::class.java)
            startActivity(intent)
        }

        btnLimpiar.setOnClickListener {
            // Limpiar los campos
            etUsuario.text.clear()
            etContrasena.text.clear()
        }
    }
}
