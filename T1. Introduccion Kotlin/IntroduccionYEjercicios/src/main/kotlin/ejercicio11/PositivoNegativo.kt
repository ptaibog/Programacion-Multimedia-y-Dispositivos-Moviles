package ejercicio11

fun main() {

    println("Introduce un número:")
    val num = readln().toInt()
    println(clasificarNumero(num))
}


fun clasificarNumero(numero: Int): String{
    if(numero > 0){
        return "El número es positivo"
    }else if (numero < 0){
        return "El numero es negativo"
    }else{
        return "Ceroooo"
    }
    /*
    return when {
        numero > 0 -> "positivo"
        numero < 0 -> "negativo"
        else -> "cero"
    }
     */
}