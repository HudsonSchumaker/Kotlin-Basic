package br.com.schumaker.kotlin.conditionals

fun main() {

    var balance = 300.00 // val balance: Double = 300.00

    if (balance > 0) {
        println("Green")
    } else if(balance == 0.0) {
        println("Orange")
    } else {
        println("Red")
    }

    balance -= 500.0
    when {
        balance > 0 -> {
            println("Green")
        }
        balance == 0.0 -> {
            println("Orange")
        }
        else -> {
            println("Red")
        }
    }

    // No need context with only one line of execution
    when {
        balance > 0    -> println("Green")
        balance == 0.0 -> println("Orange")
        else           -> println("Red")
    }
}