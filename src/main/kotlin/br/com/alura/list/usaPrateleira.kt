package br.com.alura.list

fun main() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = livros
    )

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAno.imprimeComMarcadores()
}