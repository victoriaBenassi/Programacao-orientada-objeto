package streamApi.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Agrupe os números em pares e ímpares

        System.out.println("Lista com numeros pares: " + numerosPares( numeros));
        System.out.println("Lista com numeros impares: " + numerosImpares( numeros));
    }
    public static List<Integer> numerosPares(List<Integer> numeros){
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();
    }
    public static List<Integer> numerosImpares(List<Integer> numeros){
        return numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();
    }
}
