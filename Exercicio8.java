import java.util.Scanner;

public class Exercicio8 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = CalculadoraMedia.calcularMedia(nota1, nota2, nota3);
        String mencao = CalculadoraMedia.verificarMencao(media);

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
