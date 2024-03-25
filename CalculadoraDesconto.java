import java.util.Scanner;

public class CalculadoraDesconto {
    public static void calcularDesconto() {
        Scanner scanner = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;

        do {
            System.out.println("Digite o ano do veículo:");
            int ano = scanner.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            System.out.println("Digite o valor do veículo:");
            double valor = scanner.nextDouble();

            double valorDesconto = valor * desconto;
            double valorFinal = valor - valorDesconto;

            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

            totalGeral++;
            
            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
