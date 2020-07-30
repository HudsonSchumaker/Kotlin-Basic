package br.com.schumaker.kotlin.functional

/**
 * @author Hudson Schumaker
 */
object Lambda {
    @JvmStatic
    fun main(args: Array<String>) {

        val myFunctionLambda = { a: Int, b: Int ->
            a + b
        }
        println(myFunctionLambda(15, 10))
    }
}