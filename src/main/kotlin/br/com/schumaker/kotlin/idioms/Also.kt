package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Also {

    @JvmStatic
    fun main(args: Array<String>) {
        multiply(2, 2)
        multiplyAsloPrint(5, 5)
    }

    fun multiply(a: Int, b: Int): Int {
        val c = a * b
        print(c)
        return c
    }

    fun multiplyAsloPrint(a: Int, b: Int): Int = (a * b).also { println(it) }
}
