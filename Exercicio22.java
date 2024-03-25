import java.util.Scanner;

public class Exercicio22 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite o consumo de kWh:");
        int consumoKWh = scanner.nextInt();

        ContaDeLuz contaDeLuz = new ContaDeLuz(tipoCliente);
        double valorConta = contaDeLuz.calcularValorConta(consumoKWh);

        System.out.println("Valor da conta de luz: R$" + valorConta);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}

