package ejercicio1

fun main() {
    do {
        println("\nBIENVENIDO A LA CALCULADORA")
        println("Escribe la operación (suma, resta, multiplicacion, division) o 'salir' para terminar:")
        var operacion = readln()

        if (operacion == "salir"){
            println("¡Hasta luego!")
            break
        }
        println("Por favor, introduce el primer numero")
        var num1 = readln().toDouble()
        println("Por favor, introduce el segundo numero")
        var num2 = readln().toDouble()
        var resultado = calculadora(num1,num2,operacion)
        println("El resultado de la operación $operacion es $resultado")

    }while (true)

}

fun calculadora(numero1:Double, numero2:Double, operacion: String):Double{
    return when(operacion){
        "suma" -> numero1 + numero2
        "resta" -> numero1 - numero2
        "multiplicacion" -> numero1 * numero2
        "division" -> if(numero2 != 0.0) numero1 / numero2 else {
            println("Error, no se puede dividir por 0"); 0.0
        }
        else -> {
            println("Operacion no valida")
            0.0
        }
    }
}