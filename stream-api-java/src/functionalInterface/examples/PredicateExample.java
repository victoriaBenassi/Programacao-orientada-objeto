package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
        
        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres, em seguida,
        //imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(palavra -> palavra.length() < 5)
                .forEach(System.out::println);


    }
}
