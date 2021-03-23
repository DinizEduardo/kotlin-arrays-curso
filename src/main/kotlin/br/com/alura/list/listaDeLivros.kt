package br.com.alura.list

fun main() {

    val livro1 = Livro(
        titulo = "Grande sertão: Veredas",
        autor = "Joao Guimaraes Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memorias Postumas de Bras Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "Jose de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagrana",
            autor = "Joao Guimaraes Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

//    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }

    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val joinToString = this.joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }

    println(" ### LISTA DE LIVROS ###\n$joinToString")

}