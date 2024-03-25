import java.util.Scanner;

public class Exercicio1 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
