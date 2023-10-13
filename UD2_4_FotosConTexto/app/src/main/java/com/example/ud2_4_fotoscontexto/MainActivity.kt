package com.example.ud2_4_fotoscontexto

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ou = findViewById<ImageView>(R.id.ourense)
        val san = findViewById<ImageView>(R.id.santiago)
        val texto = findViewById<TextView>(R.id.invisible)

        ou.setOnClickListener{
            texto.setText("El puente de ourense")
            texto.setVisibility(View.VISIBLE)
        }
        san.setOnClickListener{
            texto.setText("Catedral")
            texto.setVisibility(View.VISIBLE)
        }

    }




}