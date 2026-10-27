package ejercicio3

fun main() {

    println("**Conversor de grados**")
    println("Por favor, introduce una temperatura")
    var temperatura = readln().toDouble()
    println("Por favor, introduce su unidad, celsius o fahrenheit")
    var unidad = readln()

    when (unidad){
        "celsius" -> celsiusToFahrenheit(temperatura)
        "fahrenheit" -> fahrenheitToCelsius(temperatura)
        else -> {
            println("Por favor, $unidad no es válido, introduce una unidad válida")
        }
    }
}

fun celsiusToFahrenheit(celsius:Double){
    var fahrenheit = (celsius * 1.8) + 32
    println("La temperatura equivalente es de $fahrenheit grados fahrenheit")
}
fun fahrenheitToCelsius(fahrenheit:Double){
    var celsius = (fahrenheit - 32) / 1.8
    println("La temperatura equivalente es de $celsius grados celsius")
}