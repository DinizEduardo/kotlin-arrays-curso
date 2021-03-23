package br.com.alura.array


fun range() {
    val serie: IntRange = 1.rangeTo(10)

    for (s in serie)
        println(s)

    val numerosPares = 0..100 step 2 // inclui o 100
    for (numeroPar in numerosPares)
        print("$numeroPar ")

    println()

    val numerosPares2 = 0.until(100) step 2 // não inclui o 100
    for (numeroPar in numerosPares2)
        print("$numeroPar ")

    println()
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Dentro")
    } else {
        println("Não está dentro")
    }

    val alfabeto = 'a'..'z'
    val letra = 'h' // h -> tá || H -> não tá
    println(letra in alfabeto)
}

