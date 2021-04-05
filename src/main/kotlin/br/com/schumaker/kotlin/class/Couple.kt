
/**
 * @author Hudson Schumaker
 * Secondary constructors
 */
 class Couple {
    var children: MutableList<Couple> = mutableListOf()
    constructor(parent: Couple) {
        parent.children.add(this)
    }
}
