package br.com.pokedex_bruna_.api

import br.com.pokedex_bruna_.api.model.PokemonApiResult
import br.com.pokedex_bruna_.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

// Interface que define os endpoints da API de Pokémons usando Retrofit.
interface PokemonService {
    @GET("pokemon")
    // Função para listar Pokémons, recebendo um parâmetro de limite para especificar quantos resultados retornar.
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonsApiResult>
    // @Query é usado para adicionar o parâmetro "limit" à URL da requisição.

    @GET("pokemon/{number}")
    // Função para obter os detalhes de um Pokémon específico pelo seu número.
    fun getPokemon(@Path("number") number: Int): Call<PokemonApiResult>
    // @Path é usado para substituir {number} na URL pelo valor do parâmetro "number".
}
