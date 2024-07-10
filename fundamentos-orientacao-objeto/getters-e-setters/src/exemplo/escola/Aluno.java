package exemplo.escola;

public class Aluno {
    private String nome;
    private int idade ;

    private String sexo;
    //get
    public String getNome() {
        return nome;
    }
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
