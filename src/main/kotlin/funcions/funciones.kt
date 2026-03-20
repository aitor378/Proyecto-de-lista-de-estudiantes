package funcions

fun pedirNombre(nombre: String, lista: MutableList<String>) {
    if (nombre.isEmpty()) {
        println("el valor introducido no es de tipo String")
    } else {
        lista.add(nombre)
        println("Tu nombre fue añadido correctamente")
    }
}

fun mostrarLista(lista: MutableList<String>) {
    for (i in lista.indices) {
        println("Hola soy ${lista[i]}")
    }
}

fun menu() {
    println("""
        ╔══════════════════════════╗
        ║   MENU DE ESTUDIANTES    ║
        ╠══════════════════════════╣
        ║  1. Mostrar estudiantes  ║
        ║  2. Añadir Estudiante    ║
        ║  3. Eliminar Estudiante  ║
        ║  3. Salir                ║
        ╚══════════════════════════╝
    """.trimIndent())
}