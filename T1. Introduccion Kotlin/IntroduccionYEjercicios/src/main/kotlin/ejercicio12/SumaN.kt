package ejercicio12

fun main() {
    println("Di un numero")
    var numero = readln().toInt()
    println("La suma de todos los num da ${sumaHasta(numero)}")

}

fun sumaHasta(n:Int):Int{
    var total = 0
    for(i in 0 .. n){
        total += i
    }
    return total
}