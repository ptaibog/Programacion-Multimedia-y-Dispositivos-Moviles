import ejercicio1.calculadora

// main
// class -> metodo en kotlin no hace falta
// public static void main (String[] args){} Entrada.main()
// en kotlin noexisten metodos estaticos

// fun  nombre (parametro : Tipo):retorno { metodo }

//en kotlin -> fun main(args: Array<String>){}

class Ejemplo{}

fun main() {

    // variables: mutables -> var / no mutables -> val (final)
    // var o val nombre: Tipo = valor puedes no poner el tipo o el valor
    var nombre: String = "Pablo" // string
    nombre = "Pablo T"
    var apellido = "Taibo"
    val edad: Int = 42
    var altura = 1.72 //Double
    var acierto = true // Boolean
    var correo: String? = null // ? = null safety
    lateinit var direccion: String // va a tener valor pero mas adelante
    // Mi nombre es borja y mi apellido es X
    println("Mi nombre es $nombre y mi apellido es $apellido, y mi nombre tiene ${nombre.length} letras")
    println("Mi correo es ${correo?.length ?: "vacio"}") // hay que poner una ? para que no continue si el valor es nulo
    //operador elvis, no quiero que salga nulo ?: "lo que se ejecuta si es nulo"
    direccion = "Madrid"
    println("Mi direccion es $direccion")
    println("Dime tu nombre")
    var nombreSaludo: String = readln()
    println("Cuantas veces?")
    var veces: Int = readln().toInt() //String.valueOf / Integer.parseInt("5")
    saludar(nombreSaludo, veces) // uso de parametros posicional
    //saludar(nombreSaludo)
    //saludar()
    //saludar(veces = 7) // uso de parametros nominales -> va asociado a un nombre
    //saludar(nombre= nombreSaludo)
    //saludar(nombre= nombreSaludo, veces = veces)




}

//medotos

fun saludar(nombre: String = "Anonimo", veces: Int = 1): Unit{
    //nombre -> Pablo
    //veces -> cuantas
    println("Enhorabuena $nombre has completado el programa")
    // if while dowhile for foreach switch -> es when en kotlin



    /*val resultado =
    if(veces > 9){
        5
    }else{
        0
    }

     */
// when se puede guardar en una variable
    /*val resultado = when(veces){
        1->{1}
        2->{2}
        in 3..10->{5}
        else -> {10}
    }
     */

    //for
// for de 0 hasta veces incluidos ( 0 .. veces)
    // until es veces-1
    // veces step 2 -> crece de dos en dos ( +=2 )
    /*for( i in 0 until veces){
        println("Enhorabuena $nombre has completado el programa")
    }

     */

    //for (i in veces downTo 0){} //si quieres 1 menos aqui seria veces -1

    //forma corta del for
    // [0..4]
    /*(0 until veces).forEach {
        println("Enhorabuena $nombre has completado el programa")
    }

     */


}