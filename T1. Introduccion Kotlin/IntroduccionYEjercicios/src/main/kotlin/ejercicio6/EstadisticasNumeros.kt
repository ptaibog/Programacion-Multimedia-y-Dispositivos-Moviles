package ejercicio6

fun main() {

    var arrayNumeros = arrayListOf<Int>(2,13,22,27,1,82,37,44,70,59)

    println(sumaPromedioMayorNumero(arrayNumeros))

}

fun sumaPromedioMayorNumero(arrayList: ArrayList<Int>):Triple<Int, Double, Int>{

    var suma = arrayList.sum()
    var promedio = arrayList.average()
    var mayorNum = arrayList.max()


    return Triple(suma, promedio, mayorNum)
}
