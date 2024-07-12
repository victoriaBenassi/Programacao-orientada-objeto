package Pesquisa.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List <Livro> livrosList;

    public CatalogoLivro() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> livrosPorAtor = new ArrayList<>();
        if(!livrosList.isEmpty()){// se essa lista estiver vazia ele retorna true senão false, estamos negando ! entao o retorno inverte
            for (Livro livroAutor : livrosList) {
                if(livroAutor.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAtor.add(livroAutor);
                }
            }
        }
    return livrosPorAtor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro livroIntervalo : livrosList) {
                if(livroIntervalo.getAnoPublicacao()>= anoInicial && livroIntervalo.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livroIntervalo);
                }
            }
        }
    return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null; // iniciando um objeto do tipo livro 
        if(!livrosList.isEmpty()){
            for (Livro livroTitulo : livrosList) {
                if(livroTitulo.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livroTitulo; // pegando o objeto encontrado dentro do list e atribuindo a referência do livroPorTitulo.
                    break;  // não preciso continuar fazendo o laço porque so preciso encontrar um titulo
                }
            }
        }
    return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1 ", " autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1 ", " autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2 ", " autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3 ", " autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4 ", " autor 4", 1994);

        System.out.println(catalogoLivro.pesquisarPorAutor(" autor 2"));

        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2020, 2021));

        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1 "));
    }
}