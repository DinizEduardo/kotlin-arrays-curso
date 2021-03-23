package br.com.alura.list

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

val livros: MutableList<Livro?> = mutableListOf(livro1, null, livro2, livro3, livro4, null)