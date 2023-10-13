package com.example.ud2_5_constraintlayout_InicioSes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nom = findViewById<EditText>(R.id.nombre)
        val con = findViewById<EditText>(R.id.contraseña)
        val bot = findViewById<Button>(R.id.inicio)
        val vis = findViewById<TextView>(R.id.salida)

        bot.setOnClickListener{
            vis.setText("Usuario: "+nom.text+" Contraseña: "+con.text)
        }


    }

}