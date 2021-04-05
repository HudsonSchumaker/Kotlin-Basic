package br.com.schumaker.kotlin.inline

/**
 * @author Hudson Schumaker
 */
object Inline {

    @JvmStatic
    fun main(args: Array<String>) {
        println("What am I doing ? ${doesNotMakeSense("I dummo")}")

        makeMoreSense {
            "here it is the block"
        }
    }

    private inline fun doesNotMakeSense(something: String) {
        println(something)
    }

    inline fun makeMoreSense(block: () -> String) {
        println("******")
        println(block())
        println("******")
    }
}