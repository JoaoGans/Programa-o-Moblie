//Bruna Porto De Lima e João Guilherme Gans
//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.




// Gerencia uma lista de tarefas
class GerenciadorDeTarefas {
    private val listaTarefas = mutableListOf<Tarefa>()

    // Adiciona uma nova tarefa à lista
    fun adicionarTarefa(tarefa: Tarefa) {
        listaTarefas.add(tarefa)
    }

    // Remove uma tarefa da lista pelo título
    fun removerTarefa(titulo: String): Boolean {
        val tarefa = listaTarefas.find { it.titulo == titulo }
        return if (tarefa != null) {
            listaTarefas.remove(tarefa)
            true
        } else {
            false
        }
    }

    // Busca uma tarefa na lista pelo título
    fun buscarTarefa(titulo: String): Tarefa? {
        return listaTarefas.find { it.titulo == titulo }
    }

    // Marca uma tarefa como concluída pelo título
    fun marcarComoConcluida(titulo: String): Boolean {
        val tarefa = listaTarefas.find { it.titulo == titulo }
        return if (tarefa != null) {
            tarefa.concluida = true
            true
        } else {
            false
        }
    }

    // Lista as tarefas ordenadas por data de vencimento
    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        return listaTarefas.sortedBy { it.dataVencimento }
    }
}