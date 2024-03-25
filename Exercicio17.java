import java.util.Scanner;

public class Exercicio17 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double reajuste = Salario.calcularReajuste(salario, salarioMinimo);
        double novoSalario = Salario.calcularNovoSalario(salario, salarioMinimo);

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

        // Aumento na folha de pagamento
        double aumentoFolha = novoSalario - salario;
        System.out.println("A empresa vai aumentar sua folha de pagamento em: R$" + aumentoFolha);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
