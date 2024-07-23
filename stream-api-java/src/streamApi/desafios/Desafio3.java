package streamApi.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verifique se todos os números da lista são positivos

        numeros.stream()
                .filter(numero -> numero >= 0)
                .forEach(System.out::println);
    }
}
