//Bruna Porto De Lima e João Guilherme Gans
// Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês.
// Utilize o comando when. Caso o valor seja fora deste intervalo, imprima uma mensagem de erro.


fun main() {
    // Solicita ao usuário que insira um número de 1 a 12
    println("Insira um número de 1 a 12 correspondente a um mês do ano:")
    val numeroMes = readLine()?.toIntOrNull() // Lê a entrada do usuário e a converte para um Inteiro ou null se não for um número

    // Verifica se o número inserido está dentro do intervalo válido (1 a 12)
    if (numeroMes in 1..12) {
        // Usa o comando 'when' para imprimir o nome do mês correspondente
        val nomeMes = when (numeroMes) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Inválido" // Este caso nunca deve ocorrer, pois o número foi validado anteriormente
        }
        println("O mês correspondente ao número $numeroMes é $nomeMes.") // Imprime o nome do mês correspondente
    } else {
        // Se o número inserido estiver fora do intervalo válido, imprime uma mensagem de erro
        println("Número inválido. Por favor, insira um número entre 1 e 12.")
    }
}

