package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Instance {

    @JvmStatic
    fun main(args: Array<String>) {
        whatInstance(Batman())
    }

    fun whatInstance(superHero: SuperHero) {
        when(superHero) {
            is Batman -> superHero.callAlfred()
            is Superman -> superHero.fly()
            else -> println("Unknown superhero")
        }
    }
}

interface SuperHero
class Batman : SuperHero {
    fun callAlfred() {
        println("To the Bat-cave")
    }
}
class Superman : SuperHero {
    fun fly() {
        println("Up, up and away")
    }
}