/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import kotlin.math.max
import kotlin.math.min

abstract class AbstractPokemon(
    override val name: String,
    override val maxHp: Int,
    override val strength: Int
) : Pokemon {
    override var currentHp = maxHp
        set(value) {
            field = max(0, min(value, maxHp))
        }

    override fun attack(other: Pokemon) {
        other.currentHp -= strength / 10
    }

    protected fun normalDamageFrom(pokemon: Pokemon) {
        pokemon.currentHp -= strength / 10
    }

    protected fun resistantDamageFrom(pokemon: Pokemon) {
        pokemon.currentHp -= strength / 10 / 2
    }

    protected fun weaknessDamageFrom(pokemon: Pokemon) {
        pokemon.currentHp -= strength / 10 * 3 / 2
    }

    override fun isKo() = currentHp == 0
}
