package org.example

import funcions.editarEstudiante
import funcions.eliminarEstudiante
import funcions.menu
import funcions.mostrarLista
import funcions.pedirNombre

fun main() {
    var opcion: Int

    val tabla = mutableListOf(
        mutableListOf("Smith",    "Presente", "Ausente",  "Presente", "Presente", "Ausente"),
        mutableListOf("Juan",     "Ausente",  "Presente", "Presente", "Ausente",  "Presente"),
        mutableListOf("Fernando", "Presente", "Presente", "Ausente",  "Presente", "Presente")
    )

    do {
        menu()
        opcion = readln().toInt()
        when(opcion) {
            1 -> {
                mostrarLista(tabla)
            }

            2 -> {
                pedirNombre(tabla)
            }

            3 -> {
                eliminarEstudiante(tabla)
            }

            4 -> {
                editarEstudiante(tabla)
            }
        }
    } while (opcion != 5)

}