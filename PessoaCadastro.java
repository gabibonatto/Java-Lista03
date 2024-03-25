public class PessoaCadastro {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public PessoaCadastro(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaAptaServicoMilitar() {
        return (idade >= 18 && idade <= 25 && saude);
    }

    public char getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }
}