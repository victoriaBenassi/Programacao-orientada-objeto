package exemplos;

public class SistemaIbge {
    public static void main(String[] args) {
        // a cada EstadoBrasileiro sendo chamado de e, é igual ao meu EstadoBrasileiro.values()
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }
        //selecionar um estado brasileiro de forma especifica
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
