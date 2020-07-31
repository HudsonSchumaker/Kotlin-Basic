package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Filter {
    @JvmStatic
    fun main(args: Array<String>) {
        listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
            .filter {n ->
                n > 65
            }.let (::println)
    }
}