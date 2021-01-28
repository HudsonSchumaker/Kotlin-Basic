package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object When {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}
