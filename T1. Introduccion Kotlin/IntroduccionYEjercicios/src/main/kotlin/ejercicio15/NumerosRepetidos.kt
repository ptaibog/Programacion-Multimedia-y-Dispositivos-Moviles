package ejercicio15

fun main() {
    val arrayEnteros = arrayListOf<Int>(2,4,5,5,6,7,8,8,2,9,11,8,11,4,123)
    val arrayDistinct = arrayEnteros.distinct()
    println(arrayDistinct)
}