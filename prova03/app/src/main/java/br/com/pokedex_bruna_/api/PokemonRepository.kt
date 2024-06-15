package br.com.pokedex_bruna_.api

import br.com.pokedex_bruna_.api.model.PokemonApiResult
import br.com.pokedex_bruna_.api.model.PokemonsApiResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Objeto Singleton que atua como repositório para acessar os dados da API de Pokémons.
object PokemonRepository {
    // Instância do serviço Retrofit para fazer as chamadas da API.
    private val service: PokemonService

    init {
        // Inicialização do Retrofit com a URL base da API e o conversor Gson.
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/") // URL base da API de Pokémons.
            .addConverterFactory(GsonConverterFactory.create()) // Conversor para JSON.
            .build()

        // Criação do serviço PokemonService com Retrofit.
        service = retrofit.create(PokemonService::class.java)
    }

    // Função para listar Pokémons com um limite especificado (padrão é 151).
    fun listPokemons(limit: Int = 151): PokemonsApiResult? {
        val call = service.listPokemons(limit) // Faz a chamada para listar Pokémons.

        return call.execute().body() // Executa a chamada e retorna o corpo da resposta.
    }

    // Função para obter os detalhes de um Pokémon específico pelo seu número.
    fun getPokemon(number: Int): PokemonApiResult? {
        val call = service.getPokemon(number) // Faz a chamada para obter detalhes de um Pokémon.

        return call.execute().body() // Executa a chamada e retorna o corpo da resposta.
    }
}
