package br.com.pokedex_bruna_.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.pokedex_bruna_.api.PokemonRepository
import br.com.pokedex_bruna_.domain.Pokemon

// ViewModel para gerenciar os dados relacionados aos Pokémons.
class PokemonViewModel : ViewModel() {
    var pokemons = MutableLiveData<List<Pokemon?>>() // LiveData para a lista de Pokémons.

    init {
        // Inicializa um thread para carregar os Pokémons em segundo plano.
        Thread(Runnable {
            loadPokemons()
        }).start()
    }

    // Função privada para carregar os Pokémons do repositório.
    private fun loadPokemons() {
        val pokemonsApiResult = PokemonRepository.listPokemons() // Chama o repositório para listar os Pokémons.

        // Se o resultado da API não for nulo, processa os resultados.
        pokemonsApiResult?.results?.let {
            // Mapeia cada resultado da API para um objeto Pokemon e atualiza a LiveData.
            pokemons.postValue(it.map { pokemonResult ->
                // Extrai o número do Pokémon a partir da URL.
                val number = pokemonResult.url
                    .replace("https://pokeapi.co/api/v2/pokemon/", "")
                    .replace("/", "").toInt()

                // Obtém os detalhes do Pokémon a partir do repositório.
                val pokemonApiResult = PokemonRepository.getPokemon(number)

                // Se os detalhes do Pokémon não forem nulos, cria um objeto Pokemon.
                pokemonApiResult?.let {
                    Pokemon(
                        pokemonApiResult.id,
                        pokemonApiResult.name,
                        pokemonApiResult.types.map { type ->
                            type.type // Mapeia os tipos de Pokémon.
                        }
                    )
                }
            })
        }
    }
}