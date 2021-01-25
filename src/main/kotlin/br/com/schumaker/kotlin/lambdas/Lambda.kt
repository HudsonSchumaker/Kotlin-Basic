package br.com.schumaker.kotlin.lambdas

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

        // Lambda returning more the 1 option

        val calculateBonus: (salary: Double) -> Double = lambda@{ s ->
            if(s > 1000.0) {
                return@lambda s + 50
            }
            s + 100.0
        }
        println(calculateBonus(1100.0))
    }
}
