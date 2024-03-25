public class Estudante {
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExameFinal;

    public Estudante(double notaLaboratorio, double notaAvaliacao, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExameFinal * 5) / 10;
    }
}

