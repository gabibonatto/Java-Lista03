public class Contratados {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Contratados(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        double abono = 0;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 80.00;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 50.00;
            }
        }
        return abono;
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
