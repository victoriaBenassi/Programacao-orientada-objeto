package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        //criar lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o consumer com expressão lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
           if(numero % 2 == 0){
              System.out.println(numero);
            }
        };

        //Usar o Consumer para imprimir números pares no Stream
        numeros.stream().filter(numero -> numero % 2 == 0 )
                .forEach(System.out::println);
    }
}
