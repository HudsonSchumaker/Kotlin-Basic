package br.com.schumaker.kotlin.basics

/**
 * @author Hudson Schumaker
 */
class FunctionReturn {
    fun returnFullName(firstName: String, surname: String): String {
        return "${firstName} ${surname}"
    }

    fun main(args: Array<String>) {
        val fullName: String = returnFullName("James", "Bond")
        println(fullName) // prints: James Bond
    }
}
