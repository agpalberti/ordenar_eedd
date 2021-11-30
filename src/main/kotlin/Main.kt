
fun main() {

    println("Introduce los números que quieras, separados por comas.")
    val listaInput = readLine()?.split(',', ignoreCase = true, limit = 0)

    val listaNumeros:MutableList<Int> = mutableListOf()

    try {

    listaInput?.forEach { listaNumeros.add(it.toInt()) }} catch (_:Exception) {
        println("La entrada no fue correcta")}

    repeat(listaNumeros.size){
    for (i in 0 until listaNumeros.size-1){
        if (listaNumeros[i] > listaNumeros[i+1]){
            val constant = listaNumeros[i+1]
            listaNumeros.add(i,constant)
            listaNumeros.removeAt(i+2)
        }
    }
    }

    println(listaNumeros)

    repeat(listaNumeros.size){
        for (i in 0 until listaNumeros.size-1){
            if (listaNumeros[i] < listaNumeros[i+1]){
                val constant = listaNumeros[i+1]
                listaNumeros.add(i,constant)
                listaNumeros.removeAt(i+2)
            }
        }
    }

    println(listaNumeros)



}