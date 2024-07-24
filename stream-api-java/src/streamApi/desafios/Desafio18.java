package streamApi.desafios;

import java.util.*;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream()
                .allMatch(numero -> numero.equals(numeros.get(0)));// Verifica se todos são iguais ao primeiro elemento

        System.out.println("Todos números da lista são iguais ? "+ todosIguais);
    }
}
