package Pesquisa.exercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros(){
        this.numerosInteiros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }
    public int calcularSoma(){
        int resultadoSoma = 0;
        if(!numerosInteiros.isEmpty()){
            for (Integer numeroLista : numerosInteiros) {
                resultadoSoma += numeroLista;
            }
        }
    return resultadoSoma;
    }
    public int encontrarMaiorNumero(){
        int numeroMaior = 0;
        if(!numerosInteiros.isEmpty()){
            numeroMaior = Collections.max(numerosInteiros);
        }
    return numeroMaior;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosInteiros.isEmpty()){
            for (Integer numero : numerosInteiros) {
                if(numero <= menorNumero ){
                    menorNumero = numero;
                }
                
            }
        }
    return menorNumero;
    }
    public void exibirNumeros(){
        System.out.println(numerosInteiros.toString());
    }
    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
    
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
    
        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    
        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

        //exibindo a lista de numeros
        somaNumeros.exibirNumeros();
    }
}

