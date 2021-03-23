package br.com.alura.list

fun main() {
    livros
        .groupBy { it?.editora ?: "Editora Desconhecida" }
        .forEach { (editora: String?, livros) ->
            println("$editora: ${livros.joinToString { it?.titulo.toString() }}")
        }
}