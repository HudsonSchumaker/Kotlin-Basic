package br.com.schumaker.kotlin.collections

/**
 * @author Hudson Schumaker
 */
fun main() {
    val b1 = Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        year = 1956
    )

    val b2 = Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        year = 1942,
        press = "Editora A"
    )

    val b3 = Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        year = 1881
    )

    val b4 = Book(
        title = "Iracema",
        author = "José de Alencar",
        year = 1865,
        press = "Editora B"
    )

    val books: MutableList<Book> = mutableListOf(b1, b2, b3, b4)

    books.add(
        Book(
            title = "Sagarana",
            author = "João Guimarães Rosa",
            year = 1946
        )
    )

    books.printWithMarks()
    books.remove(b1)
    books.printWithMarks()

    val orderByYear: List<Book> = books.sorted()
    orderByYear.printWithMarks()

    val orderByTitle = books.sortedBy { it.title }
    orderByTitle.printWithMarks()

    books.sortedBy { it.author }.printWithMarks()
}
