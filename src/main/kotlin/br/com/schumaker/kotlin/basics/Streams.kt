/**
 * @author Hudson Schumaker
 */
class Streams {
    val numbers = (1..10).toList()

    // Return a view, no copy here
    val reversed = (1..10).toList().asReversed()

    val sequence = (1..10).toList().asSequence()
}
