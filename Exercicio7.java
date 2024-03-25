import java.util.Scanner;

public class Exercicio7 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double custoConsumidor = CalculadoraCustoCarro.calcularCustoConsumidor(custoFabrica);

        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}

