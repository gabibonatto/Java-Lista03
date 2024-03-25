import java.util.Scanner;

public class Exercicio15 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina ou diesel) ou '0' para encerrar:");
            String combustivel = scanner.nextLine();

            if (combustivel.equals("0")) {
                break;
            }

            System.out.println("Digite o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();
            scanner.nextLine(); 

            Veiculo veiculo = new Veiculo(combustivel, valorVeiculo);
            double desconto = veiculo.calcularDesconto();
            double valorFinal = veiculo.calcularValorFinal();

            totalDesconto += desconto;
            totalPago += valorFinal;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);
        }

        System.out.println("Total de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
