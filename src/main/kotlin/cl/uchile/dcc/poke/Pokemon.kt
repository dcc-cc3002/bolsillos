/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import java.util.*

class Pokemon(val name: String, val maxHp: Int, val strength: Int) {
    var currentHp = maxHp

    fun attack(other: Pokemon) {
        other.currentHp -= strength / 10
    }

    override fun equals(other: Any?) = when {
        this === other -> true
        other !is Pokemon -> false
        else -> Pokemon::class == other::class
                && name == other.name
                && maxHp == other.maxHp
                && strength == other.strength
    }

    override fun hashCode() = Objects.hash(Pokemon::class, name, maxHp, strength)
}
