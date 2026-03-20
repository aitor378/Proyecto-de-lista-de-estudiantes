package org.example

import funcions.eliminarEstudiante
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

            3 -> {
                println("Puedes introducir el nombre del estudiante para eliminar:")
                nombre = readln()
                eliminarEstudiante(nombre, listaDeEstudiantes)
            }
        }
    } while (opcion != 4)

}