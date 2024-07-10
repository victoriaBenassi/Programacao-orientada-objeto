package exemplos.pilares.heranca;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("102030");
        jeep.ligar();
        
        Moto mt07 = new Moto();
        mt07.setChassi("304050");
    }
}
