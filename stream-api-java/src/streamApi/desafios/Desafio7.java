package streamApi.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Encontrar o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .sorted((a,b)-> b.compareTo(a))// ordena em ordem decrescente
                .skip(1)//pula o primerio elemento (maior numero)
                .findFirst(); //pega o primeiro elemento restante (segundo maior)
        System.out.println("O segundo maior numero da lista é : " + segundoMaior.get());
    }
}
