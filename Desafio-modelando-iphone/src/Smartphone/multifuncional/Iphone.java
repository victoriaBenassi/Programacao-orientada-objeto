package Smartphone.multifuncional;

import Smartphone.funcionalidades.AparelhoTelefonico;
import Smartphone.funcionalidades.NavegadorInternet;
import Smartphone.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void exibirPagina(String url) {
        System.out.println("Abrindo a pagina : "+ url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba. ");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina. ");
    }
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo a ligação ");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void tocar() {
        System.out.println("Tocando musica ");
    }
    public void pausar() {
        System.out.println("Musica pausada ");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada : "+ musica);
    }
}
