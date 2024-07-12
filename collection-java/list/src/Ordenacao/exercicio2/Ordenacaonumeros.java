package Ordenacao.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Ordenacaonumeros{
 private List<Integer> listaNumeros;

    public Ordenacaonumeros(){
        this.listaNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
    List <Integer> numerosAscendente = new ArrayList<>(listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeErrorException(null, "A lista está vazia! ");
        }
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
          numerosAscendente.sort(Collections.reverseOrder());
          return numerosAscendente;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros.toString());
        }
        else{
            System.out.println("A lista esta vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        Ordenacaonumeros numeros = new Ordenacaonumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }
}
   