package com.example.hogwartsseleccionador

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Griffindor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_griffindor)


        // Cogemos el botón back correspondiente y creamos el evento listener
        val back3: Button = findViewById(R.id.back)
        back3.setOnClickListener {
            val intent = Intent(this, SeleccionarCasa::class.java)
            startActivity(intent)
        }

        // Cogemos el botón back_inicio correspondiente y creamos el evento listener
        val back_inicio3: Button = findViewById(R.id.back_inicio)
        back_inicio3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





    }
}