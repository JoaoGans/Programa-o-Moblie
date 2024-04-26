// Bruna Porto De Lima e João Guilherme Gans
// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralho que represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:


// Representa um baralho de cartas
class Baralho {
    private val naipes = arrayOf("♠️", "♥️", "♦️", "♣️")
    private val valores = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
    private val cartas = mutableListOf<Carta>()

    // Inicializa o baralho preenchendo-o com todas as cartas
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }

    // Embaralha as cartas no baralho
    fun embaralhar() {
        cartas.shuffle()
    }

    // Distribui uma quantidade específica de cartas do baralho
    fun distribuir(qtdCartas: Int): List<Carta> {
        val mao = mutableListOf<Carta>()
        for (i in 0 until qtdCartas) {
            mao.add(cartas.removeAt(0))
        }
        return mao
    }
}

