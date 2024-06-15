package br.com.pokedex_bruna_.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.pokedex_bruna_.R
import br.com.pokedex_bruna_.domain.Pokemon
import com.bumptech.glide.Glide

// Adapter para o RecyclerView que exibe uma lista de Pokémons.
class PokemonAdapter(
    private val items: List<Pokemon?> // Lista de Pokémons a ser exibida.
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    // Cria e infla a view para cada item do RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    // Retorna o tamanho da lista de itens.
    override fun getItemCount() = items.size

    // Vincula os dados do Pokémon à view do ViewHolder.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindView(item)
    }

    // ViewHolder interno para o RecyclerView.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Função para vincular os dados do Pokémon às views do layout.
        fun bindView(item: Pokemon?) = with(itemView) {
            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon) // Imagem do Pokémon.
            val tvNumber = findViewById<TextView>(R.id.tvNumber)    // Número do Pokémon.
            val tvName = findViewById<TextView>(R.id.tvName)        // Nome do Pokémon.
            val tvType1 = findViewById<TextView>(R.id.tvType1)      // Tipo 1 do Pokémon.
            val tvType2 = findViewById<TextView>(R.id.tvType2)      // Tipo 2 do Pokémon.

            // Verifica se o item não é nulo antes de preencher os dados.
            item?.let {
                // Carrega a imagem do Pokémon usando Glide.
                Glide.with(itemView.context).load(it.imageUrl).into(ivPokemon)

                // Define o texto para as views.
                tvNumber.text = "Nº ${item.formattedNumber}"
                tvName.text = item.formattedName
                tvType1.text = item.types[0].name.capitalize()

                // Verifica se o Pokémon tem um segundo tipo.
                if (item.types.size > 1) {
                    tvType2.visibility = View.VISIBLE
                    tvType2.text = item.types[1].name.capitalize()
                } else {
                    tvType2.visibility = View.GONE
                }
            }
        }
    }
}