/*
 * "Bolsillos" (c) by R8V.
 *  "Bolsillos" is licensed under a
 *  Creative Commons Attribution 4.0 International License.
 *  You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

/*
 * "pokemon-kt" (c) by R8V.
 * "pokemon-kt" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <https://creativecommons.org/licenses/by/4.0/>.
 */
class PokemonSpec : FunSpec({
    lateinit var salandit: Pokemon
    lateinit var scolipede: Pokemon

    beforeEach {
        salandit = Pokemon("Salandit")
        scolipede = Pokemon("Scolipede")
    }

    test("A Pokémon can be created with a name") {
        salandit.name shouldBe "Salandit"
        scolipede.name shouldBe "Scolipede"
    }
})