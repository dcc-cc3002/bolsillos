/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import java.util.*

/**
 * A Pokémon is a creature that lives in the wild and can be captured by a trainer.
 *
 * @property name       The name of the Pokémon.
 * @property maxHp      The maximum amount of HP the Pokémon can have.
 * @property strength   The strength of the Pokémon.
 *
 * @constructor Creates a new Pokémon with the given name, maximum HP and strength.
 */
class Pokemon(val name: String, val maxHp: Int, val strength: Int) {
    override fun equals(other: Any?) = when {
        this === other -> true
        other !is Pokemon -> false
        else -> other::class == Pokemon::class
                && name == other.name
                && maxHp == other.maxHp
                && strength == other.strength
    }

    override fun hashCode() = Objects.hash(Pokemon::class, name, maxHp, strength)
}
