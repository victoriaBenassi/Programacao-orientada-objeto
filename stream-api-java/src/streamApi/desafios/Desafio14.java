package streamApi.desafios;

import java.util.*;
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Encontre o maior número primo da lista
        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(Desafio14::isPrimo)// Filtra apenas os números que são primos
                .max(Comparator.naturalOrder());// Encontra o maior número (último na ordem natural)

        System.out.println("O maior número primo na lista é: " + maiorNumeroPrimo.get());

    }
    public static boolean isPrimo(int n) {
        // Verifica se o número é menor ou igual a 1, caso contrário, não é primo
        if (n <= 1) {
            return false;
        }
        // Faz um loop de 2 até a raiz quadrada do número
        for (int i = 2; i * i <= n; i++) {
            // Se o número for divisível por algum valor no intervalo, não é primo
            if (n % i == 0) {
                return false;
            }
        }
        // Se não foi encontrado divisor no loop, o número é primo
        return true;
    }
}
