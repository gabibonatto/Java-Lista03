import java.util.Scanner;

public class Exercicio16 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double totalReajuste = 0;

        for (int i = 1; i <= 584; i++) {
            System.out.println("Digite o salário do funcionário " + i + ":");
            double salarioFuncionario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(salarioFuncionario, salarioMinimo);
            double reajuste = funcionario.calcularReajuste();
            double novoSalario = funcionario.calcularNovoSalario();

            totalReajuste += reajuste;

            System.out.println("Reajuste para o funcionário " + i + ": R$" + reajuste);
            System.out.println("Novo salário para o funcionário " + i + ": R$" + novoSalario);
        }

        System.out.println("Total de reajuste concedido: R$" + totalReajuste);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
