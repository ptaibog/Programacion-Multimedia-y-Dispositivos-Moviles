package ejercicio19

fun main() {

    val arrayNombres = arrayListOf<String>("Alejandro", "Alba", "Fran", "Federico", "Lucia", "Juan", "Silvia", "German", "Pedro", "Cristina", "Laura", "Jimena", "Rocio", "Raul")
    println("Introduce una letra")
    val letra = readln().trim()
    if (letra.length != 1 || !letra[0].isLetter()) {
        println("Debes introducir una única letra")
        return
    }
    val coincidencias = arrayNombres.filter { it.startsWith(letra, ignoreCase = true) }

    println("Estos nombres empiezan con la letra $letra: $coincidencias")
}