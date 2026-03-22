package org.example

import funcions.*

fun main() {
    var opcion: Int

    val tabla = mutableListOf(
        mutableListOf("Smith",    "Presente", "Ausente",  "Presente", "Presente", "Ausente"),
        mutableListOf("Alonso",     "Ausente",  "Presente", "Presente", "Ausente",  "Presente"),
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

            5 -> {
                mayorAsistencia(tabla)
            }

            6 -> {
                mayorAusente(tabla)
            }

            7 -> {
                porcentajeDeAsistencia(tabla)
            }

            8 -> {
                buscarAlumno(tabla)
            }
        }
    } while (opcion != 0)

}