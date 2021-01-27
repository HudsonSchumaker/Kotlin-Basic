package br.com.schumaker.kotlin.basics

/**
 * @author Hudson Schumaker
 */
object Conditional {
    val max = if (a > b) {
      print("Choose a")
      a
    } else {
      print("Choose b")
      b
    }
}
