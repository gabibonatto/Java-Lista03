import java.util.Scanner;

public class Exercicio25 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int numeroMatricula = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        EstudanteNF estudante = new EstudanteNF(nome, numeroMatricula, nota1, nota2, nota3);

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Número de Matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota Final: " + estudante.getNotaFinal());
        System.out.println("Classificação: " + estudante.classificarEstudante());

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
