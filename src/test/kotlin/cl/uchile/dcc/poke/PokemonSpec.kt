/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

private const val SALANDIT_NAME = "Salandit"
private const val SALANDIT_HP = 48
private const val SALANDIT_STR = 44
private const val SCOLIPEDE_NAME = "Scolipede"
private const val SCOLIPEDE_HP = 60
private const val SCOLIPEDE_STR = 100


class PokemonSpec : FunSpec({
    lateinit var salandit: Pokemon
    lateinit var scolipede: Pokemon

    beforeEach {
        salandit = Pokemon(SALANDIT_NAME, SALANDIT_HP, SALANDIT_STR)
        scolipede = Pokemon(SCOLIPEDE_NAME, SCOLIPEDE_HP, SCOLIPEDE_STR)
    }

    test("Two Pokémon with the same parameters are equal") {
        val salandit2 = Pokemon(SALANDIT_NAME, SALANDIT_HP, SALANDIT_STR)
        salandit shouldNotBeSameInstanceAs salandit2
        salandit shouldBe salandit2
        val scolipede2 = Pokemon(SCOLIPEDE_NAME, SCOLIPEDE_HP, SCOLIPEDE_STR)
        scolipede shouldNotBeSameInstanceAs scolipede2
        scolipede shouldBe scolipede2
    }

    test("Two Pokémon with different parameters are not equal") {
        salandit shouldNotBe scolipede
    }
})