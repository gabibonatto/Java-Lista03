import java.util.Scanner;

public class Exercicio3 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor (em dinheiro):");
        double totalVendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nomeVendedor, salarioFixo, totalVendas);

        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário no final do mês: R$" + vendedor.calcularSalarioFinal());

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
