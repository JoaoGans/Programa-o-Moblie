package br.com.pokedex_bruna_.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// Suppressão de aviso para conversão não verificada de tipos genéricos.
@Suppress("UNCHECKED_CAST")
// Fábrica personalizada para criar uma instância de PokemonViewModel.
class PokemonViewModelFactory : ViewModelProvider.Factory {

    // Método que cria e retorna uma instância do ViewModel.
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        // Retorna uma nova instância de PokemonViewModel, convertida para o tipo genérico T.
        return PokemonViewModel() as T
    }
}
