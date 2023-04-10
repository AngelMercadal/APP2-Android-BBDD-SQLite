package com.example.hogwartsseleccionador

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Slytherin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slytherin)


        // Cogemos el botón back correspondiente y creamos el evento listener
        val back3: Button = findViewById(R.id.back4)
        back3.setOnClickListener {
            val intent = Intent(this, SeleccionarCasa::class.java)
            startActivity(intent)
        }

        // Cogemos el botón back_inicio correspondiente y creamos el evento listener
        val back_inicio3: Button = findViewById(R.id.back_inicio4)
        back_inicio3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



}