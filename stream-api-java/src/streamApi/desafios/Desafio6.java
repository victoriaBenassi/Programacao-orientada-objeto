package streamApi.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar se a lista contém algum número maior que 10

        numeros.stream().filter(numero -> numero >= 10)
                .forEach(System.out::println);

    }
}
