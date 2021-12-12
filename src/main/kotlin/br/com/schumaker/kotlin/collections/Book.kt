package br.com.schumaker.kotlin.collections

/**
 * @author Hudson Schumaker
 */
data class Book (
    val title: String,
    val author: String,
    val year: Long,
    val press: String? = null
): Comparable<Book> {
    override fun compareTo(other: Book): Int {
        return this.year.compareTo(other.year)
    }
}
