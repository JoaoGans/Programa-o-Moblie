//Bruna Porto De Lima e João Guilherme Gans
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.


// Define a classe Passaro que herda de Animal e implementa o som específico e método para cantar
class Passaro(nome: String, idade: Int) : Animal(nome, idade, "Canto") {
    // Implementação do método para fazer o pássaro cantar
    override fun fazerSom() {
        println("$nome faz $som")
    }

    // Método específico para pássaro
    fun cantar() {
        println("$nome está cantando!")
    }
}


