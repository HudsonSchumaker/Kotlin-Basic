package br.com.schumaker.kotlin.functional

/**
 * @author Hudson Schumaker
 */
object Functions {
    @JvmStatic
    fun main(args: Array<String>) {
        val myFunction: () -> Unit = ::test
        println(myFunction()) // See using the val as a method
    }

    private fun test() {
        println("Putting a function on a variable")
    }
}

