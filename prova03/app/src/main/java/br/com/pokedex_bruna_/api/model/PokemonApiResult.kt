package br.com.pokedex_bruna_.api.model

import br.com.pokedex_bruna_.domain.PokemonType

// Data class para representar o resultado da API de Pokémons.
data class PokemonsApiResult(
    val count: Int,               // Número total de Pokémons.
    val next: String?,            // URL para a próxima página de resultados (se houver).
    val previous: String?,        // URL para a página anterior de resultados (se houver).
    val results: List<PokemonResult> // Lista de resultados de Pokémons.
)

// Data class para representar um Pokémon individual no resultado da API.
data class PokemonResult(
    val name: String, // Nome do Pokémon.
    val url: String   // URL com detalhes do Pokémon.
)

// Data class para representar os detalhes de um Pokémon específico a partir da API.
data class PokemonApiResult(
    val id: Int,                // ID do Pokémon.
    val name: String,           // Nome do Pokémon.
    val types: List<PokemonTypeSlot> // Lista de tipos do Pokémon.
)

// Data class para representar um slot de tipo de Pokémon.
data class PokemonTypeSlot(
    val slot: Int,          // Posição do tipo na lista de tipos do Pokémon.
    val type: PokemonType   // Tipo do Pokémon, definido na classe PokemonType.
)
