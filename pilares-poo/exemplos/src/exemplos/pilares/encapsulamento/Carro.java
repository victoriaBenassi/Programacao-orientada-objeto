package exemplos.pilares.encapsulamento;

public class Carro {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
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