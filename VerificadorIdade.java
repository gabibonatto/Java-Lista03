import java.util.Scanner;

public class VerificadorIdade {
    public static void verificarIdade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas você deseja verificar?");
        int numPessoas = scanner.nextInt();

        for (int i = 1; i <= numPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }

        scanner.close();
    }
}
