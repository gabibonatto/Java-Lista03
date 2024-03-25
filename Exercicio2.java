import java.util.Scanner;

public class Exercicio2 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida (em km):");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = ConsumoAutomovel.calcularConsumoMedio(distanciaPercorrida, combustivelGasto);

        System.out.println("Consumo médio do automóvel: " + consumoMedio + " km/l");

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
