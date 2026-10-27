package ejercicio17

fun main() {

    var arrayProductos = arrayListOf<String>()

    while (true){
        println("Introduce un producto o (fin) para terminar")
        var producto = readln()
        if (producto == "fin"){
            println("Lista de la compra cerrada")
            break
        }else{
            arrayProductos.add(producto)
        }
    }

    println(arrayProductos)

}