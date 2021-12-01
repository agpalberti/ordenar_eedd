fun ordenarBurbuja(element: List<Int>): List<Int> {
    val listaNumeros = element.toMutableList()

    repeat(listaNumeros.size) {
        for (i in 0 until listaNumeros.size - 1) {
            if (listaNumeros[i] > listaNumeros[i + 1]) {
                val constant = listaNumeros[i + 1]
                listaNumeros.add(i, constant)
                listaNumeros.removeAt(i + 2)
            }
        }
    }

    return listaNumeros.toList()
}


fun main() {

    println("Introduce los números que quieras, separados por comas.")
    val listaInput = readLine()?.split(',', ignoreCase = true, limit = 0)

    var listaNumeros: MutableList<Int> = mutableListOf()

    try {

        listaInput?.forEach { listaNumeros.add(it.toInt()) }
    } catch (_: Exception) {
        println("La entrada no fue correcta")
        return
    }



    println(listaNumeros)

    listaNumeros = ordenarBurbuja(listaNumeros).toMutableList()

    println("Lista ordenada según el método de la burbuja: $listaNumeros")

    println("Lista invertida :${listaNumeros.reversed()}")


}