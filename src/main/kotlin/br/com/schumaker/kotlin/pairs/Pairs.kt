
package br.com.schumaker.kotlin.pairs

/**
 * @author Hudson Schumaker
 */
class Pair<V, C>(val vowels: V, val consonants: C) {
    override fun hashCode(): Int {
        return vowels.hashCode() xor consonants.hashCode()
    }

    override fun equals(o: Any?): Boolean {
        if (o !is Pair<*, *>) {
            return false
        }
        return vowels == o.vowels && consonants == o.consonants
    }

    companion object {
        fun <V, C> of(vowels: V, consonants: C): Pair<V, C> {
            return Pair(vowels, consonants)
        }
    }
}
