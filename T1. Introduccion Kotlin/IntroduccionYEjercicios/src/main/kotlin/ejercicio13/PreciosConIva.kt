package ejercicio13

fun main() {

    val arraySinIva = arrayListOf<Double>(30.0,19.99,96.50,2.40)
    //println(calcularIva(arraySinIva))
    val preciosConIva = arraySinIva.map { it * 1.21 }
    println("Precios con IVA:")
    preciosConIva.forEach{
        println("${"%.2f".format(java.util.Locale.US, it)} €")
    }

}

/*fun calcularIva(arrayList: ArrayList<Double>):ArrayList<Double>{
    var precioTotal:Double
    var arrayConIva  = arrayListOf<Double>()
    for (i in 0 until arrayList.size){
        precioTotal = arrayList[i]*(1.21)
        arrayConIva.add(precioTotal)
    }
    return arrayConIva
}

 */

