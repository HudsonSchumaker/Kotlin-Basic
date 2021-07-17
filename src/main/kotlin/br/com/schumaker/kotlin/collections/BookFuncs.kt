package br.com.schumaker.kotlin.collections

fun List<Book?>.printWithMarks() {
    val text = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.title} de ${it.author}"
        }
    println(" #### List of Books #### \n$text")
}