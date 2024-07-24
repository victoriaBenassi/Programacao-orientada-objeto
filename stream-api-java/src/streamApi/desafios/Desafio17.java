package streamApi.desafios;

import java.util.*;
import static streamApi.desafios.Desafio14.isPrimo;
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Filtrar os números primos da lista
        numeros.stream()
                .filter(Desafio14::isPrimo)
                .toList()
                .forEach(System.out::println);
    }
}
