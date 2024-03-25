import java.util.Scanner;

public class Exercicio24 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacao = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        Estudante estudante = new Estudante(notaLaboratorio, notaAvaliacao, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();

        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
