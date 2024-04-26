//Bruna Porto De Lima e João Guilherme Gans
//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.


import java.time.LocalDate

// Função principal para demonstrar o funcionamento do GerenciadorDeTarefas
fun main() {
    val gerenciador = GerenciadorDeTarefas()

    // Adicionando algumas tarefas
    gerenciador.adicionarTarefa(
        Tarefa(
            "Comprar mantimentos",
            "Comprar frutas e legumes para a semana",
            LocalDate.of(2024, 4, 27),
            Prioridade.MEDIA
        )
    )

    gerenciador.adicionarTarefa(
        Tarefa(
            "Estudar Kotlin",
            "Revisar conceitos básicos de Kotlin",
            LocalDate.of(2024, 4, 30),
            Prioridade.ALTA
        )
    )

    gerenciador.adicionarTarefa(
        Tarefa(
            "Fazer exercícios de programação",
            "Resolver os exercícios do livro",
            LocalDate.of(2024, 4, 25),
            Prioridade.BAIXA
        )
    )

    // Listando tarefas por data de vencimento
    val tarefasOrdenadas = gerenciador.listarTarefasPorDataVencimento()
    println("Tarefas ordenadas por data de vencimento:")
    tarefasOrdenadas.forEachIndexed { index, tarefa ->
        println("${index + 1}. $tarefa")
    }

    // Marcar uma tarefa como concluída
    val tituloTarefaConcluida = "Fazer exercícios de programação"
    gerenciador.marcarComoConcluida(tituloTarefaConcluida)
    println("\nApós marcar '$tituloTarefaConcluida' como concluída, a lista de tarefas atualizada é:")
    gerenciador.listarTarefasPorDataVencimento().forEachIndexed { index, tarefa ->
        println("${index + 1}. $tarefa")
    }
}