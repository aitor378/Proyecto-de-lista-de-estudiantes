package model

class Clase(
    val nombre: String,
    val descripcion: String,
    val alumnos: MutableList<Alumno> = mutableListOf()
)