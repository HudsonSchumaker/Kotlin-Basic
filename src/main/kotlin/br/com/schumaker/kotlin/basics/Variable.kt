package br.com.schumaker.kotlin.basics

fun main() {

    var number: Int? = null

    // can change value
    var owner = "Hudson" // var owner: String = "Hudson"

    // Concatenation template
    owner = "$owner Luiz"

    // can not change value
    val birthYear = 1985

    println("Owner: $owner")
    println(birthYear)
    print(number)
}