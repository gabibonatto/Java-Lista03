import java.util.Scanner;

public class Exercicio4 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolar = scanner.nextDouble();

        ConversorMoeda conversor = new ConversorMoeda(cotacaoDolar);
        double valorEmReal = conversor.converterParaReal(quantidadeDolar);

        System.out.println("O valor em reais é: R$" + valorEmReal);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
