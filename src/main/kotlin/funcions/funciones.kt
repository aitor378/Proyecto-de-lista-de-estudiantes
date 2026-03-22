package funcions

fun pedirNombre(lista: MutableList<MutableList<String>>) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    if (nombre.isEmpty()) {
        println("el valor introducido no es de tipo String")
    } else {
        lista.add(mutableListOf(nombre, "", "", "", "", ""))
        println("Estudiante añadido correctamente")
    }
}

fun mostrarLista(lista: MutableList<MutableList<String>>) {
    println("Nombre     | Lunes     | Martes    | Miércoles | Jueves    | Viernes")
    println("-".repeat(75))

    for (fila in lista) {
        for (columna in fila) {
            print("${columna.padEnd(10)} |")
        }
        println()
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
        ║  4. Editar Estudiante    ║
        ║  5. Salir                ║
        ╚══════════════════════════╝
    """.trimIndent())
}

fun eliminarEstudiante(lista: MutableList<MutableList<String>>) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val indice = lista.indexOfFirst { it[0] == nombre}

    if (indice != 1) {
        lista.removeAt(indice)
        println("El estudiante se elimino correctamente")
    } else {
        println("El estudiante no existe")
    }
}

fun editarEstudiante(lista: MutableList<MutableList<String>>) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val indice = lista.indexOfFirst { it[0] == nombre}

    if (indice != -1) {
        subMenu()
        val columna = readln().toInt()

        if (columna in 0..5) {
            println("Introduce el nuevo valor:")
            lista[indice][columna] = readln()
            println("Valor actualizado correctamente")
        } else {
            println("Opción no valida")
        }
    } else {
        println("El estudiante no existe")
    }
}


fun subMenu() {
    println("""
        ╔════════════════════════════╗
        ║    MENU DEL ESTUDIANTE     ║
        ╠════════════════════════════╣
        ║  0. Nombre del estudiante  ║
        ║  1. Lunes                  ║
        ║  2. Martes                 ║
        ║  3. Miercoles              ║
        ║  4. Jueves                 ║
        ║  5. Viernes                ║
        ╚════════════════════════════╝
    """.trimIndent())
}