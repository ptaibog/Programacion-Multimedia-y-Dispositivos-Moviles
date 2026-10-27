package ejercicio4

fun main() {


    var opcion: String? = null
    var listaNombres = arrayListOf<String>()

    while (opcion != "salir"){
        println("Por favor, introduce un nombre, o salir para terminar")
        opcion = readln()
        if(opcion != "salir"){
            listaNombres.add(opcion)
            println("Se ha añadido a $opcion")
        }else{
            println("Saliendo..")
        }
    }

    nombresMayusculas(listaNombres)

}

fun nombresMayusculas(arrayList: ArrayList<String>){
    var arrayUppercase = arrayList.map { it.uppercase() }
    println(arrayUppercase)
}