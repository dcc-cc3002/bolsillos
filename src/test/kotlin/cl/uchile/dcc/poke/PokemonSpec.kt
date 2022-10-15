/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

private const val SALANDIT_NAME = "Salandit"
private const val SALANDIT_HP = 48
private const val SALANDIT_STR = 44
private const val SCOLIPEDE_NAME = "Scolipede"
private const val SCOLIPEDE_HP = 60
private const val SCOLIPEDE_STR = 100
import io.kotest.matchers.shouldHave
import io.kotest.matchers.shouldNot
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.haveSameHashCodeAs
import io.kotest.matchers.types.shouldNotBeSameInstanceAs


class PokemonSpec : FunSpec({
    lateinit var salandit: Pokemon
    lateinit var scolipede: Pokemon

    beforeEach {
        salandit = Pokemon("Salandit", 48, 44)
        scolipede = Pokemon("Scolipede", 60, 100)
    }

    test("Two Pokémon with the same parameters should be equal") {
        val salandit2 = Pokemon("Salandit", 48, 44)
        salandit shouldNotBeSameInstanceAs salandit2
        salandit shouldBe salandit2
        val scolipede2 = Pokemon("Scolipede", 60, 100)
        scolipede shouldNotBeSameInstanceAs scolipede2
        scolipede shouldBe scolipede2
    }

    test("Two Pokémon with the same parameters should have the same hash code") {
        val salandit2 = Pokemon("Salandit", 48, 44)
        salandit should haveSameHashCodeAs(salandit2)
        val scolipede2 = Pokemon("Scolipede", 60, 100)
        scolipede should haveSameHashCodeAs(scolipede2)
    }
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

    test("A Pokémon can attack another Pokémon") {
        salandit.attack(scolipede)
        scolipede.currentHp shouldBe SCOLIPEDE_HP - SALANDIT_STR / 10
    }

    test("A Pokémon can be KO") {
        salandit.isKo() shouldNotBe false
        salandit.currentHp = 0
        salandit.isKo() shouldBe true
    test("Two Pokémon with different parameters should not be equal") {
        salandit shouldNotBeSameInstanceAs scolipede
        salandit shouldNotBe scolipede
    }

    test("Two Pokémon with different parameters should not have the same hash code") {
        salandit shouldNotBeSameInstanceAs scolipede
        salandit shouldNot haveSameHashCodeAs(scolipede)
    }
})