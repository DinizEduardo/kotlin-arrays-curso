package br.com.alura.list

fun List<Livro?>.imprimeComMarcadores() {
    val joinToString = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "- ${it.titulo} de ${it.autor}"
        }

    println(" ### LISTA DE LIVROS ###\n$joinToString")

}