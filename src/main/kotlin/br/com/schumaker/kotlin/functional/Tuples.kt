package br.com.schumaker.kotlin.functional

/**
 * @author Hudson Schumaker
 */
object Tuples {
    @JvmStatic
    fun main(args: Array<String>) {

        // Pair contains 2 properties
        val pair = "BMW" to 1

        // Does not work, it is immutable
        // pair.first = "Mercedes"
        // pair.second = 2

        val (k, v) = pair
        println("$k : $v")

        val tup = Pair("elem1", "elem2")
        val (e1, e2) = tup
        println("$e1 : $e2")

        val trip = Triple("Hamilton", "Verstappen", "Vettel")
        println("Großer Preis von Österreich: ${trip.first}, ${trip.second}, ${trip.third}")
    }
}