package com.dam2.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sec: MutableList<Int> = mutableListOf<Int>()
        var user_sec: MutableList<Int> = mutableListOf<Int>()
        var finished  = false
        val button_red : Button = findViewById(R.id.rojo)
        val button_yellow : Button = findViewById(R.id.amarillo)
        val button_blue : Button = findViewById(R.id.azul)
        val button_green : Button = findViewById(R.id.verde)
        val button_start : Button = findViewById(R.id.start)

        val toast = Toast.makeText(applicationContext,"Juego terminado", Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(applicationContext,"Inicio", Toast.LENGTH_SHORT)
    }
}