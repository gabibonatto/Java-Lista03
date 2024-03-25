import java.util.Scanner;

public class LeitorPessoas {
    public static void lerPessoas() {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
                i--; // Decrementa o contador para repetir a entrada para a mesma pessoa
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
