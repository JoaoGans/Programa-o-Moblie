//Bruna Porto De Lima e João Guilherme Gans
//Crie uma classe abstrata Animal com atributos como nome, idade e som.
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.



// Define a classe Cachorro que herda de Animal e implementa o som específico e método para latir
class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "Au Au") {
    // Implementação do método para fazer o cachorro latir
    override fun fazerSom() {
        println("$nome faz $som")
    }

    // Método específico para cachorro
    fun latir() {
        println("$nome está latindo!")
    }
}
