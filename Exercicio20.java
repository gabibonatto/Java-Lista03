import java.util.Scanner;

public class Exercicio20 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        System.out.println("Digite a quantidade de horas/aula dadas pelo professor:");
        int horasAula = scanner.nextInt();

        Professor professor = new Professor(nivel);
        double salario = professor.calcularSalario(horasAula);

        System.out.println("Salário do professor: R$" + salario);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
