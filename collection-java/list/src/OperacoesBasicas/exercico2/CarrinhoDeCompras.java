package OperacoesBasicas.exercico2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List <Item> itensLista;

    public CarrinhoDeCompras(){
        this.itensLista = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itensLista.add(item);
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item item : itemParaRemover) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }
        }
        itensLista.removeAll(itemParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itensLista.isEmpty()){
            for(Item item : itensLista){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; 
            }
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(itensLista);
    }
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }
    
}

