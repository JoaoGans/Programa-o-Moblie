// Bruna Porto De Lima e João Guilherme Gans
// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralho que represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:


// Representa um jogador com uma mão de cartas
class Jogador(private val nome: String) {
    val mao = mutableListOf<Carta>()

    // Adiciona as cartas recebidas à mão do jogador
    fun receberCartas(cartas: List<Carta>) {
        mao.addAll(cartas)
    }

    // Mostra a mão atual do jogador
    fun mostrarMao() {
        println("Mão do jogador $nome:")
        mao.forEach { println(it) }
    }

    // Verifica as combinações de cartas na mão do jogador
    fun verificarCombinacoes() {
        val combinacoes = mutableListOf<Pair<String, List<String>>>()

        if (temPar()) {
            val cartasPar = mao.groupBy { it.valor }.filter { it.value.size == 2 }.values.flatten()
            combinacoes.add("Par" to cartasPar.map { it.toString() })
        }

        if (temTrinca()) {
            val cartasTrinca = mao.groupBy { it.valor }.filter { it.value.size == 3 }.values.flatten()
            combinacoes.add("Trinca" to cartasTrinca.map { it.toString() })
        }

        if (temFullHouse()) {
            val cartasFullHouse = mao.groupBy { it.valor }.filter { it.value.size == 3 || it.value.size == 2 }.values.flatten()
            combinacoes.add("Full House" to cartasFullHouse.map { it.toString() })
        }

        if (temFlush()) {
            val cartasFlush = mao.map { it.toString() }
            combinacoes.add("Flush" to cartasFlush)
        }

        println("Combinações encontradas:")
        if (combinacoes.isNotEmpty()) {
            combinacoes.forEach { println("${it.first} encontrado: ${it.second}") }
        } else {
            println("Nenhuma combinação encontrada.")
        }
    }

    // Verifica se há um Par na mão do jogador
    private fun temPar(): Boolean {
        val contagemValores = mao.groupBy { it.valor }.mapValues { it.value.size }
        return contagemValores.count { it.value == 2 } == 1
    }

    // Verifica se há uma Trinca na mão do jogador
    private fun temTrinca(): Boolean {
        val contagemValores = mao.groupBy { it.valor }.mapValues { it.value.size }
        return contagemValores.any { it.value == 3 }
    }

    // Verifica se há um Full House na mão do jogador
    private fun temFullHouse(): Boolean {
        val contagemValores = mao.groupBy { it.valor }.mapValues { it.value.size }
        val tresOcorrencias = contagemValores.values.count { it == 3 }
        val duasOcorrencias = contagemValores.values.count { it == 2 }
        return tresOcorrencias == 1 && duasOcorrencias == 1
    }

    // Verifica se há um Flush na mão do jogador
    private fun temFlush(): Boolean {
        val naipes = mao.map { it.naipe }
        val primeiroNaipe = naipes.first()
        return naipes.all { it == primeiroNaipe }
    }


}

