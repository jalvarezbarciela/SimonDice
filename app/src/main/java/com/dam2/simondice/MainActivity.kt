package com.dam2.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast



import androidx.lifecycle.Observer
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Estado : Boolean
        val butonrojo : Button = findViewById(R.id.rojo)
        val botonamarillo : Button = findViewById(R.id.amarillo)
        val botonazul : Button = findViewById(R.id.azul)
        val botonverde : Button = findViewById(R.id.verde)
        val start : Button = findViewById(R.id.start)
        val check : Button = findViewById(R.id.check)
        val Btcolor = listOf(butonrojo,botonverde,botonamarillo,botonazul)
        val toast = Toast.makeText(applicationContext,"Juego terminado", Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(applicationContext,"Inicio", Toast.LENGTH_SHORT)

        val ModeloJuego by viewModels<liveData>()

        ModeloJuego.gameState.observe(this, Observer{
                gs -> Estado = gs
            if(Estado) {
                butonrojo.setEnabled(false)
                botonamarillo.setEnabled(false)
                botonazul.setEnabled(false)
                botonverde.setEnabled(false)
                check.setEnabled(false)
            }else{
                butonrojo.setEnabled(true)
                botonamarillo.setEnabled(true)
                botonazul.setEnabled(true)
                botonverde.setEnabled(true)
                check.setEnabled(true)
            }
        })

        ModeloJuego.secuenciaJ.observe(this, Observer{
            ModeloJuego.showSec(Btcolor)
        })

        start.setOnClickListener{
            toast2.show()
            ModeloJuego.init_game()
        }

        check.setOnClickListener{
            if(!ModeloJuego.checkSec()){
                toast.show()
            }
        }
        butonrojo.setOnClickListener{
            ModeloJuego.addUserSec(1)
        }
        botonverde.setOnClickListener{
            ModeloJuego.addUserSec(2)
        }
        botonamarillo.setOnClickListener{
            ModeloJuego.addUserSec(3)
        }
        botonazul.setOnClickListener{
            ModeloJuego.addUserSec(4)
        }
    }
}