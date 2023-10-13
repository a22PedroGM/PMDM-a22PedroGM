package com.example.ud02_3_linearlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.boton)
        val nombre = findViewById<TextView>(R.id.nombre)
        val salida = findViewById<TextView>(R.id.salida)

        boton.setOnClickListener { salida.text = "Llamando a "+nombre.text }
    }
}