package br.com.schumaker.kotlin.basics

interface Interfaces {

}

interface Machine<T> {
    fun process(product: T)
}

/*interface Oven {
  fun process(product: Bakeable)
}*/

//interface Oven: Machine<Bakeable>
