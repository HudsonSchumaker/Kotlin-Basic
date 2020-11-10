package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Apply {
    @JvmStatic
    fun main(args: Array<String>) {
        // Normal java way
        val agentJavaWay = JamesBond()
        agentJavaWay.name = "Sean Connery"
        agentJavaWay.movie = "Satanic Dr. no"
        agentJavaWay.alsoStarring = "The Rock"

        println(agentJavaWay.printMe())

        // Using apply
        val `007` = JamesBond().apply {
            name = "Sean Connery"
            movie = "Satanic Dr. no"
            alsoStarring = "From Russia with love"
        }

        println(`007`.printMe())
    }
}

class JamesBond {
    lateinit var name: String
    lateinit var movie: String
    lateinit var alsoStarring: String

    fun printMe() {
        print("[name = $name, movie = $movie, alsoStarring = $alsoStarring]")
    }
}
