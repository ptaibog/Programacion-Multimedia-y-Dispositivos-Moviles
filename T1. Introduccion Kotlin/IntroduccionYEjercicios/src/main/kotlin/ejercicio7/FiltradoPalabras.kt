package ejercicio7

/*
Declara un ArrayList con varias palabras. Pide al usuario que introduzca un número N y filtra
las palabras que tengan más de N caracteres. Muestra el resultado ordenado alfabéticamente.
 */

fun main() {

    var arrayPalabras = arrayListOf<String>("Jamacuco", "Albricias", "Maravitupendo", "Pera", "Ceniza",
        "Velociraptor", "Maraca", "Esternocleidomastoideo")

    println("Introduce un número para filtrar (>N caracteres)")
    var numero = readln().toInt()
    println(filtradoPalabras(arrayPalabras, numero))

}

fun filtradoPalabras(arrayList: ArrayList<String>, numeroFiltrar: Int):List<String>{

    var arrayFiltrado = arrayList.filter { it.length >= numeroFiltrar }
    return arrayFiltrado.sorted()
}

