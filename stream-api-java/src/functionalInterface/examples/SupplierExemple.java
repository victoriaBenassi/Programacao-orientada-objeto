package functionalInterface.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemple {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        List<String> listaSaudacoes = Stream.generate(()-> "Olá, seja bem vindo(a)! ")
                .limit(5)
                .toList();

        //imprimir as saudaçoes geradas usando um method reference
        listaSaudacoes.forEach(System.out::println);// impressão de cada elemento dentro da lista de saudações
    }
}
