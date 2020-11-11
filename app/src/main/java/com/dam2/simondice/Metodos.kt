package com.dam2.simondice

class Metodos {
    fun CrearSecuencia(): IntArray {
        val secuencia = IntArray(4)
        for (i in 0..3) {
            secuencia[i] = Math.floor(Math.random() * 4 + 1).toInt()
        }
        return secuencia
    }

    fun CompararSecuencia(secuencia1: IntArray,secuencia2: IntArray): Boolean {
        var resultado = true
        for (i in 0..3) {
            resultado = if (secuencia1[i] == secuencia2[i]) {
                true
            } else {
                false
            }
            if (resultado == false) {
                break
            }
        }
        return resultado
    }

}
