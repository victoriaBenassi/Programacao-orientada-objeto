package Pesquisa.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equals(descricao)){
                    tarefaRemover = tarefa;
                    break;
                }
            }
         tarefaSet.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio! ");
        }
    }
    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluidas = new HashSet<>();
        for (Tarefa tarefaC : tarefaConcluidas) {
            if (tarefaC.isConcluida()) {
                tarefaConcluidas.add(tarefaC);
            }
        }
        return tarefaConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefaP : tarefasPendentes) {
            if(!tarefaP.isConcluida()){
                tarefasPendentes.add(tarefaP);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }
}
