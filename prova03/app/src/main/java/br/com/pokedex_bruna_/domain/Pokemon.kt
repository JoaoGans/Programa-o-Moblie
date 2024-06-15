
package br.com.pokedex_bruna_.domain

// Data class que representa um Pokémon.
data class Pokemon(
    val number: Int,               // Número do Pokémon na Pokédex.
    val name: String,              // Nome do Pokémon.
    val types: List<PokemonType>   // Lista de tipos do Pokémon.
) {
    // Propriedade que retorna o nome formatado com a primeira letra maiúscula.
    val formattedName = name.capitalize()

    // Propriedade que retorna o número formatado com três dígitos, preenchendo com zeros à esquerda se necessário.
    val formattedNumber = number.toString().padStart(3, '0')

    // Propriedade que retorna a URL da imagem do Pokémon baseada no número formatado.
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}