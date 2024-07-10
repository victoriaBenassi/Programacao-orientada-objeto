package exemplo.lanchonete;

import exemplo.lanchonete.area.cliente.Cliente;
import exemplo.lanchonete.atendimento.Atendente;
import exemplo.lanchonete.atendimento.cozinha.Almoxarife;
import exemplo.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabeleciomento {
    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
        Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
        atendente.servindoMesa();
		atendente.receberPagamento();
    }	
		
}
