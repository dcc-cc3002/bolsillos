/*
 * "Bolsillos" (c) by R8V.
 * "Bolsillos" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 */

package cl.uchile.dcc.poke

interface Pokemon {
    val name: String
    val maxHp: Int
    val strength: Int
    var currentHp: Int
    fun attack(other: Pokemon)
    fun isKo(): Boolean
}