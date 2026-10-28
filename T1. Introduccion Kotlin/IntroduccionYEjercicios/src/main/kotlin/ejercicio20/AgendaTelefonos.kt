package ejercicio20

fun main() {

    val agenda = mapOf<String,String>(
        "ana" to "654321098",
        "luis" to "678901234"
    )

    println("Introduce un nombre: ")
    val nombre = readln().trim().lowercase()
    if (agenda.contains(nombre)){
        val telefono = agenda[nombre]
        println(telefono)
    }else{
        println("$nombre no esta en la agenda")
    }

}