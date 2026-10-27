package ejercicio9

fun main() {

    var arrayCalificaciones = arrayListOf<Double>(4.6,7.1,9.0,6.5,7.0,3.8,9.5,5.5,6.0,3.0,7.6,8.8,4.0,3.0)
    println("Promedio: ${calculaPromedio(arrayCalificaciones)}")
    println("Total aprobadas: ${totalAprobados(arrayCalificaciones)}")
    println("Nota mas alta: ${notaMasAlta(arrayCalificaciones)}")
}

fun calculaPromedio(array: ArrayList<Double>):Double{
    return array.average()
}
fun totalAprobados(array: ArrayList<Double>):Int{
    return array.count{ it >= 5 }
}
fun notaMasAlta(array: ArrayList<Double>):Double{
    return array.max()
}


