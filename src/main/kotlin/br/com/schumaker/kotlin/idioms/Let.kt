package br.com.schumaker.kotlin.idioms

import kotlin.random.Random

/**
 * @author Hudson Schumaker
 */
object Let {
    @JvmStatic
    fun main(args: Array<String>) {
        val sometimesNull = if (Random.nextBoolean()) "not null" else null
        sometimesNull?.let {
            print("It was $it this time.")
        }
    }
}