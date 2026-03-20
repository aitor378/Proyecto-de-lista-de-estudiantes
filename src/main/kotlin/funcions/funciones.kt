package funcions

fun pedirNombre(nombre: String, lista: MutableList<String>) {
    if (nombre.isEmpty()) {
        println("el valor introducido no es de tipo String")
    } else {
        lista.add(nombre)
        mostrarLista(lista)
    }
}

fun mostrarLista(lista: MutableList<String>) {
    for (i in lista.indices) {
        println("Hola soy ${lista[i]}")
    }
}