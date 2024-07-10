package Smartphone.usuario;
import Smartphone.multifuncional.Iphone;

public class vitoria {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("1199293884");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica("Ali gatie - It's you ");
        iphone.pausar();
        iphone.tocar();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://exemplo.com");
        iphone.atualizarPagina();
    }
}
