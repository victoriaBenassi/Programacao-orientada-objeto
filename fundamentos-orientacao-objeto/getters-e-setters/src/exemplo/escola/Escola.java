package exemplo.escola;

public class Escola {
    public static void main(String[] args) {
        //estanciando a classe aluno
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jose");
        felipe.setIdade(9);

        System.out.println("O aluno "+ felipe.getNome() + " tem "+ felipe.getIdade() + " anos.");
    }
}
