package exemplos.pilares.heranca;
//classes especializada para representar da classe generica
public class Carro extends Veiculo {
    
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("carro ligado");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("Conferindo cambio");
    }
}