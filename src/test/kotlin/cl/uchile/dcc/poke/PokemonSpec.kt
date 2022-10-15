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

    test("Two Pokémon with different parameters should not be equal") {
        salandit shouldNotBeSameInstanceAs scolipede
        salandit shouldNotBe scolipede
    }

    test("Two Pokémon with different parameters should not have the same hash code") {
        salandit shouldNotBeSameInstanceAs scolipede
        salandit shouldNot haveSameHashCodeAs(scolipede)
    }
})