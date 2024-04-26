// Bruna Porto De Lima e João Guilherme Gans
// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralho que represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:

fun main() {
    // Cria um baralho e o embaralha
    val baralho = Baralho()
    baralho.embaralhar()

    // Cria um jogador
    val jogador = Jogador("Jogador 1")

    // Distribui 5 cartas aleatórias para o jogador
    jogador.receberCartas(baralho.distribuir(5))

    // Mostra a mão do jogador e verifica suas combinações
    jogador.mostrarMao()
    jogador.verificarCombinacoes()
}

