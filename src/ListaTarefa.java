import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public int getQuantidadeTarefas() {
        return tarefas.size();
    }

    public void mostrarTarefas() {
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println(listaTarefa.getQuantidadeTarefas());
        listaTarefa.mostrarTarefas();
        listaTarefa.removerTarefa("tarefa 1");
        listaTarefa.mostrarTarefas();

    }

}
