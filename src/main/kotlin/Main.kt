package org.example

fun main() {
    val nombre: String
    val listaDeEstudiantes: MutableList<String>

    listaDeEstudiantes = mutableListOf("Smith", "Juan", "Fernando")

    nombre = readln()

    if (nombre.isEmpty()) {
        println("el valor introducido no es de tipo String")
    } else {
        listaDeEstudiantes.add(nombre)
        for (i in listaDeEstudiantes.indices) {
            println("Hola soy ${listaDeEstudiantes[i]}")
        }
    }
}