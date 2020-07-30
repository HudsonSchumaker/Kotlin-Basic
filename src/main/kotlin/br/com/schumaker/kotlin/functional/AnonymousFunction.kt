package br.com.schumaker.kotlin.functional

/**
 * @author Hudson Schumaker
 */
object AnonymousFunction {

    @JvmStatic
    fun main(args: Array<String>) {
        val myAnonymousFunction = fun(a: Int, b: Int) : Int {
            return a + b
        }
        println(myAnonymousFunction(20, 10))

        val myAnonymousFunction2 = fun(a: Int, b: Int) : Int = a + b
        println(myAnonymousFunction2(10, 10))
    }
}