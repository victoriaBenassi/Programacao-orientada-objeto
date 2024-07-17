package pesquisa.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }
    public void adicionarPalavras(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(palavras.containsKey(palavra)){
            palavras.remove(palavra);
        }
        else {
            System.out.println("Palavra não encontrada");
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String,Integer> entry: palavras.entrySet()){
            if(!palavras.isEmpty()){
                maiorContagem = entry.getValue();
            palavraMaisFrequente= entry.getKey();
            }
        }
        return  palavraMaisFrequente;
    }
    public void exibirPalavars(){
        System.out.println(palavras.toString());
    }
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);
        contagemLinguagens.exibirPalavars();

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

        //remove Palavra
        contagemLinguagens.removerPalavra("Java");
        contagemLinguagens.exibirPalavars();

    }
}
