package ejercicio14

fun main() {
    println("Introduce una palabra: ")
    var palabra = readln()
    println(invertirPalabra(palabra))
}

fun invertirPalabra(string: String):String{
    return string.reversed()
}