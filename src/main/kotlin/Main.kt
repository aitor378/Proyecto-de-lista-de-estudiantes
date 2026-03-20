package org.example

import funcions.menu
import funcions.mostrarLista
import funcions.pedirNombre

fun main() {
    var opcion: Int
    var nombre: String
    val listaDeEstudiantes: MutableList<String>
    listaDeEstudiantes = mutableListOf("Smith", "Juan", "Fernando")

    do {
        menu()
        opcion = readLine()!!.toInt()
        when(opcion) {
            1 -> {
                mostrarLista(listaDeEstudiantes)
            }

            2 -> {
                println("Puedes introducir tu nombre:")
                nombre = readln()
                pedirNombre(nombre, listaDeEstudiantes)
            }
        }
    } while (opcion != 3)

}