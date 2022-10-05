/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

@Suppress("SpellCheckingInspection")
private const val SALANDIT_NAME = "Salandit"

@Suppress("SpellCheckingInspection")
private const val SCOLIPEDE_NAME = "Scolipede"

class PokemonSpec : FunSpec({
    @Suppress("SpellCheckingInspection") val salandit = Pokemon(SALANDIT_NAME)
    @Suppress("SpellCheckingInspection") val scolipede = Pokemon(SCOLIPEDE_NAME)

    test("A Pokémon can be created with a name") {
        salandit.name shouldBe "Salandit"
        scolipede.name shouldBe "Scolipede"
    }
})