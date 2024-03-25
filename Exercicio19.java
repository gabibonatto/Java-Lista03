import java.util.Scanner;

public class Exercicio19 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1 do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o lado 2 do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o lado 3 do triângulo:");
        int lado3 = scanner.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipoTriangulo = triangulo.verificarTipoTriangulo();

        System.out.println("Tipo de triângulo: " + tipoTriangulo);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
