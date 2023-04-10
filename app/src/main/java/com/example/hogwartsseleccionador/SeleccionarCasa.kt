package com.example.hogwartsseleccionador

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeleccionarCasa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seleccionar_casa)

        //val txtgrif: TextView = findViewById(R.id.txtgrif)
        //var hogwartsDB: HogwartsDatabaseHelper = HogwartsDatabaseHelper(this);
        //val numAlum = hogwartsDB.getNumeroAlumnos("Griffindorf")
        //hogwartsDB.close()

        //txtgrif.setText(numAlum)






        // Cogemos el botón de Griffindor y creamos el evento listener
        val grif: Button = findViewById(R.id.grif)
        grif.setOnClickListener {
            val intent = Intent(this, Griffindor::class.java)
            startActivity(intent)
        }

        // Cogemos el botón Slytherin correspondiente y creamos el evento listener
        val sly: Button = findViewById(R.id.sly)
        sly.setOnClickListener {
            val intent = Intent(this, Slytherin::class.java)
            startActivity(intent)
        }


        // Cogemos el botón Hufflepuff y creamos el evento listener
        val huf: Button = findViewById(R.id.huf)
        huf.setOnClickListener {
            val intent = Intent(this, Hufflepuff::class.java)
            startActivity(intent)
        }

        // Cogemos el botón Ravenclaw correspondiente y creamos el evento listener
        val rav: Button = findViewById(R.id.rav)
        rav.setOnClickListener {
            val intent = Intent(this, Ravenclaw::class.java)
            startActivity(intent)
        }

    }
}