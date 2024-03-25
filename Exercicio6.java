import java.util.Scanner;

public class Exercicio6 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de lucro desejado:");
        double percentualLucro = scanner.nextDouble();

        double valorVenda = CalculadoraValorVenda.calcularValorVenda(precoCusto, percentualLucro);

        System.out.println("O valor de venda do produto é: R$" + valorVenda);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
