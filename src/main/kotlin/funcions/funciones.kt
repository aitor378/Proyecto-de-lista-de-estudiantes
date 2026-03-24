package funcions

import model.*

fun pedirAlumno(clase: Clase) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    println("Introduce el nombre del estudiante:")
    val apellido = readln()

    println("Introduce el nombre del estudiante:")
    val edad = readln().toInt()

    println("Introduce el nombre del estudiante:")
    val curso = readln()

    println("Introduce el nombre del estudiante:")
    val dni = readln()

    val alumno = Alumno(nombre, apellido, edad, curso, dni)
    clase.alumnos.add(alumno)
    println("Alumno añadido correctamente")
}

fun mostrarLista(clase: Clase) {
    println("Nombre     | Lunes     | Martes    | Miércoles | Jueves    | Viernes")
    println("-".repeat(75))

    for (alumno in clase.alumnos) {
        println(alumno)
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

fun eliminarEstudiante(clase: Clase) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val indice = clase.alumnos.indexOfFirst { it.nombre == nombre }

    if (indice != 1) {
        clase.alumnos.removeAt(indice)
        println("El estudiante se elimino correctamente")
    } else {
        println("El estudiante no existe")
    }
}

fun editarEstudiante(clase: Clase) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val indice = clase.alumnos.indexOfFirst { it.nombre == nombre }

    if (indice != -1) {
        subMenu()
        val opcion = readln().toInt()

        println("Introduce el nuevo valor:")
        val nuevoValor = readln()

        clase.alumnos[indice] = when (opcion) {
            1 -> clase.alumnos[indice].copy(nombre = nuevoValor)
            2 -> clase.alumnos[indice].copy(apellido = nuevoValor)
            3 -> clase.alumnos[indice].copy(edad = nuevoValor.toInt())
            4 -> clase.alumnos[indice].copy(curso = nuevoValor)
            5 -> clase.alumnos[indice].copy(dni = nuevoValor)
            else -> clase.alumnos[indice]
        }
        println("Estudiante actualizado correctamente")
    } else {
        println("El estudiante no existe")
    }
}


fun subMenu() {
    println("""
        ╔════════════════════════════╗
        ║    MENU DEL ESTUDIANTE     ║
        ╠════════════════════════════╣
        ║  1. Nombre                 ║
        ║  2. Apellido               ║
        ║  3. Edad                   ║
        ║  4. Curso                  ║
        ║  5. Dni                    ║
        ╚════════════════════════════╝
    """.trimIndent())
}

fun mayorAsistencia(clase: Clase) {
    var maxAlumno: Alumno? = null
    var maxContador = 0

    for (alumno in clase.alumnos) {
        val contador = alumno.asistencias.count { it == "Presente" }

        if (contador > maxContador) {
            maxContador = contador
            maxAlumno = alumno
        }
    }

    if (maxAlumno != null) {
        println("El estudiante con mayor asistencia es: ${maxAlumno.nombre} con $maxContador días")
    } else {
        println("No hay alumnos")
    }
}

fun mayorAusente(clase: Clase) {
    var maxAlumno: Alumno? = null
    var maxContador = 0

    for (alumno in clase.alumnos) {
        val contador = alumno.asistencias.count { it == "Ausente" }

        if (contador > maxContador) {
            maxContador = contador
            maxAlumno = alumno
        }
    }

    if (maxAlumno != null) {
        println("El estudiante con mayor ausencia es: ${maxAlumno.nombre} con $maxContador días")
    } else {
        println("No hay alumnos")
    }
}

fun porcentajeDeAsistencia(clase: Clase) {
    for (alumno in clase.alumnos) {
        val presentes = alumno.asistencias.count { it == "Presente" }
        val porcentaje = (presentes * 100) / alumno.asistencias.size

        println("${alumno.nombre.padEnd(10)} | $porcentaje%")
    }
}

fun buscarAlumno(clase: Clase) {
    println("Introduce el nombre del estudiante:")
    val nombre = readln()

    val alumno = clase.alumnos.find { it.nombre == nombre }

    if (alumno != null) {
        println("Nombre     | Lunes     | Martes    | Miércoles | Jueves    | Viernes")
        println("-".repeat(75))

        print("${alumno.nombre.padEnd(10)} | ")
        for (asistencia in alumno.asistencias) {
            print("${asistencia.padEnd(10)} | ")
        }
        println()
    } else {
        println("El estudiante no existe")
    }
}