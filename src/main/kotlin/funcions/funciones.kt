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
        ╔══════════════════════════════╗
        ║     MENU DE ESTUDIANTES      ║
        ╠══════════════════════════════╣
        ║  1. Mostrar estudiantes      ║
        ║  2. Añadir Estudiante        ║
        ║  3. Eliminar Estudiante      ║
        ║  4. Editar Estudiante        ║
        ║  5. Mayor asistido           ║
        ║  6. Menor asistido           ║
        ║  7. Porcentage de Asistencia ║
        ║  8. Buscar alumno            ║
        ║  0. Salir                    ║
        ╚══════════════════════════════╝
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

fun mayorAsistencia(lista: MutableList<MutableList<String>>) {
    var maxNombre: String = ""
    var maxContador: Int = 0

    for (fila in lista) {
        var contador = 0
        for (i in 1..5) {
            if (fila[i] == "Presente") {
                contador++
            }
        }
        if (contador > maxContador) {
            maxContador = contador
            maxNombre = fila[0]
        }
    }

    println("El estudiante con mayor asistencia es: $maxNombre con $maxContador dias")
}

fun mayorAusente(lista: MutableList<MutableList<String>>) {
    var maxNombre: String = ""
    var maxContador: Int = 0

    for (fila in lista) {
        var contador = 0
        for (i in 1..5) {
            if (fila[i] == "Ausente") {
                contador++
            }
        }
        if (contador > maxContador) {
            maxContador = contador
            maxNombre = fila[0]
        }
    }

    println("El estudiante con mayor ausencia es: $maxNombre con $maxContador dias")
}

fun porcentajeDeAsistencia(lista: MutableList<MutableList<String>>) {
    for (fila in lista) {
        var contador = 0
        for (i in 1..5) {
            if (fila[i] == "Presente") {
                contador++
            }
        }
        val porcentaje = (contador * 100) / 5
        println("${fila[0].padEnd(10)} | $porcentaje%")
    }
}

fun buscarAlumno(lista: MutableList<MutableList<String>>) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val indice = lista.indexOfFirst { it[0] == nombre}

    if (indice != -1) {
        println("Nombre     | Lunes     | Martes    | Miércoles | Jueves    | Viernes")
        println("-".repeat(75))
        for (columna in lista[indice]) {
            print("${columna.padEnd(10)} |")
        }
        println()
    } else {
        println("El estudiante no existe")
    }
}