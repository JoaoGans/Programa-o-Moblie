//Bruna Porto De Lima e João Guilherme Gans
//Escreva um programa que dado um inteiro positivo n, calcule e imprima o valor da seguinte soma:

fun main() {
    // Solicita ao usuário que insira um número inteiro positivo:
    println("Insira um número inteiro positivo:")
    val numeroInteiroPositivo = readLine()?.toIntOrNull()
    // Lê a entrada do usuário como uma String e converte para Inteiro ou retorna null se a conversão falhar

    // Verifica se o número inserido é válido (maior que zero):
    if (numeroInteiroPositivo != null && numeroInteiroPositivo > 0) {
        // Variável para armazenar o valor da soma:
        var soma = 0.0

        // Calcula a soma conforme a fórmula fornecida e acumula na variável soma:
        for (i in 1..numeroInteiroPositivo) {
            soma += i.toDouble() / (numeroInteiroPositivo - i + 1)
            // Calcula cada termo da série e adiciona à soma
        }

        // Imprime o valor da soma:
        println("O valor da soma é: $soma")
    } else {
        // Se o número inserido não for válido, imprime uma mensagem de erro:
        println("Número inválido. Por favor, insira um número inteiro positivo.")
    }
}
