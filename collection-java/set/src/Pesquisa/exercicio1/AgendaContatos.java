package Pesquisa.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int telefone){
        contatosSet.add(new Contato(nome, telefone));
    }
    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatosSet) {
            if(contato.getNome().startsWith(nome)){ // retorna todos os contatos com o mesmo nome 
                contatosPorNome.add(contato);
            }
        } 
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novotelefone){
        Contato contadoAtualizado = null;// depois que atualizar vamos referenciar nessa nova variavel
        for (Contato contato : contatosSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novotelefone);
                contadoAtualizado = contato;
                break;
            }
        }
        return contadoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
