package Ordenacao.exercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Alunos alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
          for (Alunos a : alunosSet) {
            if (a.getMatricula() == matricula) {
              alunoParaRemover = a;
              break;
            }
          }
          alunosSet.remove(alunoParaRemover);
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
    
        if (alunoParaRemover == null) {
          System.out.println("Matricula não encontrada!");
        }
      }
    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }
    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorAlunosPorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota); 
    }
    public void exibirAlunos(){
        System.out.println(alunosSet);
    }
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);
        System.out.println("\n");

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        System.out.println("Removendo alunos com matricula invalida pelo número da matrícula");
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        gerenciadorAlunos.exibirAlunos();
        System.out.println("\n");

        // Exibindo alunos ordenados por nome
        System.out.println("Exibindo alunos ordenados por nome ");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("\n");
        
        // Exibindo alunos ordenados por nota
        System.out.println("Exibindo alunos ordenados por nota");
        gerenciadorAlunos.exibirAlunosPorNota();
        
        System.out.println("\n");
        gerenciadorAlunos.exibirAlunos();
    }
      
}

