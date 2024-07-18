package ordenacao.exercicio2;

import java.util.HashMap;
import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livrosMap.put(link, livro);
    }
    public void removerLivro(String titulo){
        List<String > chavesRemover = new ArrayList<>();
        if(!livrosMap.isEmpty()){
            for(Map.Entry<String, Livro> entry: livrosMap.entrySet() ){
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chavesRemover.add(entry.getKey());
                }
            }
            for(String chave : chavesRemover){
                livrosMap.remove(chave);
            }
        }
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String,Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco , new CompararLivroPorPreco());

        Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for(Map.Entry<String , Livro> entry: livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
    return livrosOrdenadosPorPreco;
    }
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry: livrosMap.entrySet()){
            Livro livro = entry.getValue();
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if(!livrosMap.isEmpty()){
            for(Livro livro : livrosMap.values()){
                if(livro.getPreco() > precoMaisAlto){
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia! ");
        }

        for(Map.Entry<String,Livro> entry : livrosMap.entrySet()){
            if(entry.getValue().getPreco() == precoMaisAlto){
                Livro livrosComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livrosMaisCaros.add(livrosComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }
    public List<Livro> exibirLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if(!livrosMap.isEmpty()){
            for(Livro livro : livrosMap.values()){
                if(livro.getPreco() < precoMaisBaixo){
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia");
        }
        for(Map.Entry<String,Livro> entry : livrosMap.entrySet()){
            if(entry.getValue().getPreco() == precoMaisBaixo){
                Livro livrosComPrecoMaisBaixo = livrosMap.get(entry.getKey());
                livrosMaisBaratos.add(livrosComPrecoMaisBaixo);
            }
        }
        return  livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrosMap);

    }
}
