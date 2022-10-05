/*
 * "Bolsillos" (c) by R8V.
 * "Bolsillos" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import java.util.*


class WaterPokemon(
    name: String,
    maxHp: Int,
    strength: Int
) : AbstractPokemon(name, maxHp, strength) {

    override fun attack(other: Pokemon) {
        when (other) {
            is FirePokemon -> {
                other.currentHp -= (strength / 10 * 1.5).toInt()
            }

            is GrassPokemon -> {
                other.currentHp -= (strength / 10 * 0.5).toInt()
            }

            else -> {
                other.currentHp -= strength / 10
            }
        }
    }

    override fun equals(other: Any?) = when {
        this === other -> true
        other !is WaterPokemon -> false
        else -> WaterPokemon::class == other::class
                && name == other.name
                && maxHp == other.maxHp
                && strength == other.strength
    }

    override fun hashCode() = Objects.hash(WaterPokemon::class, name, maxHp, strength)
}