package br.com.alura.array

fun main() {

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    var indice1 = 0
    for (salario in salarios) {
        salarios[indice1] = salario * aumento
        indice1++
    }

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    salarios.forEachIndexed{ i, salario ->
        salarios[i] = salario * aumento
    }

    for ((indice, salario) in salarios.withIndex()) {
        salarios[indice] = salario * aumento
    }


    println(salarios.contentToString())


}
