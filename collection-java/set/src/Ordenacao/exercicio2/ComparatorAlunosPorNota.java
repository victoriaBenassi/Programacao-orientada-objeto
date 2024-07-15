package Ordenacao.exercicio2;

import java.util.Comparator;

class ComparatorAlunosPorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos aluno1, Alunos aluno2) {
        return Double.compare(aluno1.getMedia(), aluno2.getMedia());
    }
    
}
