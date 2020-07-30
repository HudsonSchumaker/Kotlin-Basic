package br.com.schumaker.kotlin.functional

/**
 * @author Hudson Schumaker
 */
object Functions {
    @JvmStatic
    fun main(args: Array<String>) {
        //val myFunction: () -> Unit = ::test
        val myFunction = ::test
        println(myFunction()) // See using the val as a method

        val doSum: (a: Int, b: Int) -> Int = ::sum
        println(doSum(2,2))
    }

    private fun test() {
        println("Putting a function on a variable")
    }

    private fun sum(a: Int, b: Int): Int = a + b
}