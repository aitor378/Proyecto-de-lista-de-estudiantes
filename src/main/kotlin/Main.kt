package org.example

import funcions.pedirNombre

fun main() {
    val nombre: String
    val listaDeEstudiantes: MutableList<String>
    listaDeEstudiantes = mutableListOf("Smith", "Juan", "Fernando")

    nombre = readln()
    pedirNombre(nombre, listaDeEstudiantes)
}