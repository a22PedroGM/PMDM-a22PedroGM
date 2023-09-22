package com.example.aplicacionud01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearch = findViewById<Button>(R.id.button)
        buttonSearch.setOnClickListener {
            val spinnerWineType = findViewById<Spinner>(R.id.wineType)
            val textTypesWines = findViewById<TextView>(R.id.textTypesWines)
            textTypesWines.text = getWines(spinnerWineType.selectedItemId).joinToString { " " }
        }
    }
    fun getWines(id:Long) :List<String> = when (id) {
        0L -> listOf("albariño","moscato","verdejo")
        1L -> listOf("rioja","ribera del duero","Toro")
        2L -> listOf("Cabernet","Franc","Merlot")
        else -> listOf()
    }
}