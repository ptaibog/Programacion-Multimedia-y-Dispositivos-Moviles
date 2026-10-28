package ejercicio18

fun main() {
    println("Introduce el num de minutos (> 0)")
    var tiempo = readln().toInt()
    while (tiempo <= 0){
        println("Mayor que 0 por favor")
        tiempo = readln().toInt()
    }
    val (horas, resto) = convertirMinutos(tiempo)
    println("Horas: $horas")
    println("Minutos restantes: $resto")


}

fun convertirMinutos(minutos:Int):Pair<Int,Int>{
    return Pair(minutos / 60, minutos % 60)
}