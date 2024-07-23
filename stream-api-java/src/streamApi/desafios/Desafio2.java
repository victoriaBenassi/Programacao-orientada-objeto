package streamApi.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Imprima a soma dos números pares da lista
        int resultado = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0, Integer::sum);
                System.out.println(resultado);
    }
}
