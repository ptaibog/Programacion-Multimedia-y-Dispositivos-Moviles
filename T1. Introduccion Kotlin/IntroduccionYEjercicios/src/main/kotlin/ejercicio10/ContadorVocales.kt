package ejercicio10

fun main() {

    println("Introduce frase para contar vocales")
    var fraseUsuario = readln()

    println("Conteo de vocales")
    //println(contadorVocales(fraseUsuario))
    for ((vocal, cantidad) in contadorVocales(fraseUsuario)){
        println("$vocal: $cantidad")
    }

}


fun contadorVocales(frase:String):Map<Char, Int>{

    var conteo = mutableMapOf<Char,Int>()
    var fraseMinus = frase.lowercase()

    (0 until frase.length).forEach{
        if (fraseMinus[it] in "aeiouáéíóú"){
            var letra = fraseMinus[it]
            conteo[letra] = (conteo[letra] ?: 0) +1
        }
    }
    return conteo
}