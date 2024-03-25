public class EstudanteNF {
    private String nome;
    private int numeroMatricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public EstudanteNF(String nome, int numeroMatricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String classificarEstudante() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNotaFinal() {
        return calcularNotaFinal();
    }
}
