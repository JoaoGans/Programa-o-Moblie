//Bruna Porto De Lima e João Guilherme Gans
//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.


import java.time.LocalDate

// Representa uma tarefa a ser realizada
class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: LocalDate,
    val prioridade: Prioridade
) {
    var concluida: Boolean = false

    // Sobrescreve o método toString para fornecer uma representação textual da tarefa
    override fun toString(): String {
        val status = if (concluida) "Concluída" else "Pendente"
        return "Título: $titulo\nDescrição: $descricao\nData de Vencimento: $dataVencimento\nPrioridade: $prioridade\nStatus: $status"
    }
}

// Enumeração para representar as prioridades das tarefas
enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

