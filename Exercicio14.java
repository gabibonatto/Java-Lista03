import java.util.Scanner;

public class Exercicio14 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("Digite o preço de custo do produto " + i + ":");
            double precoCusto = scanner.nextDouble();

            System.out.println("Digite o preço de venda do produto " + i + ":");
            double precoVenda = scanner.nextDouble();

            Produto produto = new Produto(precoCusto, precoVenda);
            String resultado = produto.verificarLucroOuPrejuizo();

            System.out.println("Resultado para o produto " + i + ": " + resultado);

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
        }

        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;

        System.out.println("Média do preço de custo: " + mediaPrecoCusto);
        System.out.println("Média do preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}

