package br.com.schumaker.kotlin.basics

/**
 * @author Hudson Schumaker
 */
interface Interfaces {

}

interface Machine<T> {
    fun process(product: T)
}

/*interface Oven {
  fun process(product: Bakeable)
}*/

//interface Oven: Machine<Bakeable>
