package streamApi.desafios;

import java.util.*;
public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Encontre o produto de todos os números da lista
        int produto = numeros.stream()
                    .reduce(1, (numero1, numero2) -> numero1 * numero2);

            System.out.println("O produto dos números é : "+ produto);
    }
}
