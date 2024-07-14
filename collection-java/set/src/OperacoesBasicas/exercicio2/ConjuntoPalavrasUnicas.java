package OperacoesBasicas.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.remove(palavra));
        } else {
            System.out.println("Palavra não encontrada no conjunto ");
        }
    }
    public void verificarPalavra(String palavra){
        if(palavrasUnicasSet.contains(palavra)){
            System.out.println("A palavra , "+ palavra + " está presente no conjunto");
        } else{
            System.out.println("A palavra , "+ palavra + "  não está presente no conjunto");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
    
        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        conjuntoLinguagens.verificarPalavra("Java");
        conjuntoLinguagens.verificarPalavra("Python");
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
      }
}
