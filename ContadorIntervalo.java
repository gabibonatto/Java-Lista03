import java.util.Scanner;

public class ContadorIntervalo {
    public static int contarNumerosNoIntervalo() {
        Scanner scanner = new Scanner(System.in);
        int numerosNoIntervalo = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                numerosNoIntervalo++;
            }
        }

        scanner.close();
        return numerosNoIntervalo;
    }
}
