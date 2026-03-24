package model

data class Alumno(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val curso: String,
    val dni: String,
    val asistencias: MutableList<String> = MutableList(5) { "Ausente" }
) {
    override fun toString(): String {
        return "${nombre.padEnd(10)} | ${asistencias.joinToString(" | ")}"
    }
}