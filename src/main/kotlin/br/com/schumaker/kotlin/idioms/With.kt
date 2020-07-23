package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object With {
    @JvmStatic
    fun main(args: Array<String>) {
        // "scope".with {...} not work

        with("scope") {
            println(this.length) // as usual 'this' can be omit
        }
    }
}