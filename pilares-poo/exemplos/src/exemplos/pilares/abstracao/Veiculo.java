package exemplos.pilares.abstracao;
//classe generica
public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();// todo veiculo precisara ligar mas cada veiculo liga de uma forma
}
