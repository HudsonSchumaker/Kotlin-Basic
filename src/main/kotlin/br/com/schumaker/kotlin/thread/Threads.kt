package br.com.schumaker.kotlin.thread

import kotlin.concurrent.thread

/**
 *  @author Hudson Schumaker
 */
object Threads {
    @JvmStatic
    fun main(args: Array<String>) {
        val t1 = thread {
            for (i in 1..100) {
                println("T1: $i")
            }
        }
    }
}
