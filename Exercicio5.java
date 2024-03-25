import java.util.Scanner;

public class Exercicio5 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = CalculadoraPrestacoes.calcularPrestacoes(valorCompra);

        System.out.println("O valor de cada prestação é: R$" + valorPrestacao);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
