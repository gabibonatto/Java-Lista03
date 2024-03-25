import java.util.Scanner;

public class Exercicio21 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.classificarCategoria();

        System.out.println("Categoria do nadador: " + categoria);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
