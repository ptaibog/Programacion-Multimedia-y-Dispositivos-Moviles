package ejercicio16

fun main() {
    println("Escribe una frase: ")
    val frase = readln()
    println("La frase tiene ${contadorPalabras(frase)} palabras")
}

fun contadorPalabras(string: String):Int{
    val palabras = string.split(" ")
    return palabras.size
}