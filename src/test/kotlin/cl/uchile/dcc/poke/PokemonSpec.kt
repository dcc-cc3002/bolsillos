/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

private const val SALANDIT_NAME = "Salandit"
private const val SCOLIPEDE_NAME = "Scolipede"

class PokemonSpec : FunSpec({
    lateinit var salandit: Pokemon
    lateinit var scolipede: Pokemon

    beforeEach {
        salandit = Pokemon(SALANDIT_NAME)
        scolipede = Pokemon(SCOLIPEDE_NAME)
    }

    test("A Pokémon can be created with a name") {
        salandit.name shouldBe SALANDIT_NAME
        scolipede.name shouldBe SCOLIPEDE_NAME
    }
})