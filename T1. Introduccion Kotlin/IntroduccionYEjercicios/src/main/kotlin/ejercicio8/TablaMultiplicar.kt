package ejercicio8

fun main() {

    println("Introduce un numero para ver su tabla de multiplicar")
    var num = readln().toInt()

    println("Aqui tienes la tabla de multiplicar del $num")
    //var arrayFormateado = tablaMultiplicar(num)

    (0 until 10).forEach{
        println("$num x " + (it +1) + " = " + tablaMultiplicar(num)[it])
    }

}

fun tablaMultiplicar(numero:Int):List<Int>{

    var arrayResultados = arrayListOf<Int>()

    for (i in 1 until 11){
        arrayResultados.add(i*numero)
    }
    return arrayResultados
}