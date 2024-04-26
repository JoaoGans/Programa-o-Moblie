//Bruna Porto De Lima e João Guilherme Gans
//Crie uma classe abstrata Animal com atributos como nome, idade e som.
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.


// Define a classe abstrata Animal com atributos comuns a todos os animais
abstract class Animal(val nome: String, val idade: Int, val som: String) {
    // Método abstrato para emitir som do animal
    abstract fun fazerSom()
}


