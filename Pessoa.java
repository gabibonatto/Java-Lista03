public class Pessoa {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') {
            if (idade <= 20) {
                pesoIdeal = (72.7 * altura) - 58;
            } else if (idade >= 21 && idade <= 39) {
                pesoIdeal = (72.7 * altura) - 53;
            } else if (idade >= 40) {
                pesoIdeal = (72.7 * altura) - 45;
            } else {
                pesoIdeal = 0; // Idade inválida
            }
        } else if (sexo == 'F') {
            if (idade < 35) {
                pesoIdeal = (62.1 * altura) - 49;
            } else if (idade >= 35 && altura <= 1.50) {
                pesoIdeal = (62.1 * altura) - 45;
            } else if (idade >= 35 && altura > 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                pesoIdeal = 0; // Idade inválida
            }
        } else {
            pesoIdeal = 0; // Sexo inválido
        }
        return pesoIdeal;
    }

    public String getNome() {
        return nome;
    }
}
