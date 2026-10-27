package ejercicio2

fun main() {
    println("Por favor, introduce 10 numeros enteros")

    var num1 = readln().toInt()
    println("Numero $num1 introducido, introduce el siguiente")
    var num2 = readln().toInt()
    println("Numero $num2 introducido, introduce el siguiente")
    var num3 = readln().toInt()
    println("Numero $num3 introducido, introduce el siguiente")
    var num4 = readln().toInt()
    println("Numero $num4 introducido, introduce el siguiente")
    var num5 = readln().toInt()
    println("Numero $num5 introducido, introduce el siguiente")
    var num6 = readln().toInt()
    println("Numero $num6 introducido, introduce el siguiente")
    var num7 = readln().toInt()
    println("Numero $num7 introducido, introduce el siguiente")
    var num8 = readln().toInt()
    println("Numero $num8 introducido, introduce el siguiente")
    var num9 = readln().toInt()
    println("Numero $num9 introducido, introduce el siguiente")
    var num10 = readln().toInt()
    println("Numero $num10 introducido, vamos a sacar los pares solo")
    listaPares(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10)

}

fun listaPares(num1:Int, num2:Int,num3:Int, num4:Int, num5:Int, num6:Int, num7:Int, num8:Int, num9:Int, num10:Int){


    var lista = arrayListOf<Int>(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10)
    var listaPares = arrayListOf<Int>()

    (0 until lista.size).forEach(){i ->
        val valorActual = lista[i]

        if ((valorActual % 2) == 0){
            listaPares.add(valorActual)
        }
    }
    println("Los numeros pares son los siguientes $listaPares y el total es de ${listaPares.size}")

}