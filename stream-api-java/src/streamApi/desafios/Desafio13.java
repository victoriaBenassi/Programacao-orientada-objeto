package streamApi.desafios;

import java.util.*;
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Filtrar os números que estão dentro de um intervalo

         numeros.stream()
                .filter(numero -> (numero > 5 && numero < 10))
                .toList()
                .forEach(System.out::println);
    }
}
