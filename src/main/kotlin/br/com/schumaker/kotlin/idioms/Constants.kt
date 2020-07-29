package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Constants {
    @JvmStatic
    fun main(args: Array<String>) {
        MyClass().printMyConst()
        AnotherClass().useConst()
    }
}
class MyClass {
    companion object {
        val MY_CONST = "My constant"
        const val PUBLIC = "Freedom" // the proper way to do it
    }

    fun printMyConst() {
        println(MY_CONST)
    }
}

class AnotherClass {
    fun useConst() {
        println(MyClass.MY_CONST)
    }
}