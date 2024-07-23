package streamApi.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Calcule a média dos números maiores que 5

        double media = numeros.stream()
                .filter(numero -> numero > 5 )
                .mapToDouble(Integer::doubleValue)
                .average() //chamado para calcular a média dos números filtrados.
                .orElseThrow(() -> new NoSuchElementException("Não fio possivel encontrar a media"));
        System.out.printf("A média para os maiores de 5 é : " + media);
    }
}
