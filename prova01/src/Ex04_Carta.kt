//Bruna Porto De Lima e João Guilherme Gans
// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralhocque represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:



// Representa uma carta com um valor e um naipe
data class Carta(val valor: String, val naipe: String) {
    override fun toString(): String {
        return "$valor$naipe"
    }
}

