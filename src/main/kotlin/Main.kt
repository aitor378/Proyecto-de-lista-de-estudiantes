import funcions.*
import model.*

fun main() {
    var opcion: Int

    val alumno1 = Alumno("Smith",    "Johnson", 20, "1A", "12345678A")
    val alumno2 = Alumno("Alonso", "Garcia", 19, "1A", "87654321B")
    val alumno3 = Alumno("Fernando", "Lopez",   21, "1A", "11223344C")

    val clase = Clase("1A", "Clase de matematicas")

    clase.alumnos.add(alumno1)
    clase.alumnos.add(alumno2)
    clase.alumnos.add(alumno3)

    do {
        menu()
        opcion = readln().toInt()
        when(opcion) {
            1 -> {
                mostrarLista(clase)
            }

            2 -> {
                pedirAlumno(clase)
            }

            3 -> {
                eliminarEstudiante(clase)
            }

            4 -> {
                editarEstudiante(clase)
            }

            5 -> {
                mayorAsistencia(clase)
            }

            6 -> {
                mayorAusente(clase)
            }

            7 -> {
                porcentajeDeAsistencia(clase)
            }

            8 -> {
                buscarAlumno(clase)
            }
        }
    } while (opcion != 0)

}