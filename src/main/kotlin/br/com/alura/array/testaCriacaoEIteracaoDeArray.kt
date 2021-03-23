package br.com.alura.array


fun testaCriacaoEIteracaoDeArray() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade)
            maiorIdade = idade
    }

    println("A maior idade eh: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade)
            menorIdade = idade
    }

    println("A menor idade eh: $menorIdade")
}