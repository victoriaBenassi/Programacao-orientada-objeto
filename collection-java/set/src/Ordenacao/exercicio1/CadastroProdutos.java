package Ordenacao.exercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade) );
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto("Smartphone", 1L, 1000d, 10);
        cadastroProdutos.adicionarProduto("Notebook", 2L,  1500d, 5);
        cadastroProdutos.adicionarProduto("Mouse", 1L,  30d, 20);
        cadastroProdutos.adicionarProduto("Teclado",4L,  50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println("Exibindo todos os produtos no cadastro");
        System.out.println(cadastroProdutos.produtoSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println("Exibindo produtos ordenados por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        // Exibindo produtos ordenados por preço
        System.out.println("Exibindo produtos ordenados por preço");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
      }
    }

