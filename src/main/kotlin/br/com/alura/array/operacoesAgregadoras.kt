package br.com.alura.array

fun operacoesAgregadoras() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val mediaIdade = idades.average()
    println(mediaIdade)

    val todosMaiores = idades.all { it >= 18 } // se todos forem maior que 18 irá ser true
    println(todosMaiores)

    val existeMaior = idades.any { it >= 18 }
    println(existeMaior)

    val maioresDeIdade = idades.filter { it >= 18 }
    println(maioresDeIdade)

    val busca = idades.find { it == 18 } // retorna o primeiro que satisfaça a condição
    println(busca)
}