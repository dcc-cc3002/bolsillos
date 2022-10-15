/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import java.util.*
import kotlin.math.max
import kotlin.math.min
import org.jetbrains.annotations.Contract
import java.util.Objects


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
    var currentHp = maxHp
        set(value) {
            field = max(0, min(value, maxHp))
        }

    /**
     * Attacks another Pokémon.
     *
     * When as Pokémon attacks another Pokémon, the attacked Pokémon loses HP equal to the strength
     * of the attacking Pokémon divided by 10.
     *
     * @param other The Pokémon to attack.
     */
    fun attack(other: Pokemon) {
        other.currentHp -= strength / 10
    }

    /**
     * Checks if the Pokémon is KO.
     *
     * A Pokémon is KO when its current HP is equal to 0.
     */
    @Contract(pure = true)
    fun isKo() = currentHp == 0

    /**
     * Checks if another object is equal to this Pokémon.
     *
     * A Pokémon is equal to another if they have the same class, name, maximum HP and strength.
     */
    @Contract(pure = true)
    override fun equals(other: Any?) = when {
        this === other -> true
        other !is Pokemon -> false
        else -> other::class == Pokemon::class
                && name == other.name
                && maxHp == other.maxHp
                && strength == other.strength
    }

    @Contract(pure = true)
    override fun hashCode() = Objects.hash(Pokemon::class, name, maxHp, strength)

    @Contract(pure = true)
    override fun toString() = "Pokemon(name: $name, maxHp: $maxHp, strength: $strength)"
}
