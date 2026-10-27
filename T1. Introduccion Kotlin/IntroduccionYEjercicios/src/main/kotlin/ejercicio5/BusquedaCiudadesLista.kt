package ejercicio5

fun main() {

    var arrayCiudades = arrayListOf<String>("Viena", "Madrid", "Gijón", "Vigo", "Barcelona"
        , "Berlín", "París", "Ámsterdam", "Oslo", "Sofía", "Bruselas", "Varsovia", "Zagreb", "Cartagena"
        , "Granada", "Bratislava", "Roma", "Londres", "Bucarest")

    println("Introduce una ciudad para verificar si existe en el array")
    var ciudad = readln()

    if(arrayCiudades.contains(ciudad)){
        println("Enhorabuena, existe $ciudad")
    }else{
        println("$ciudad no esta en la lista..")
    }


}