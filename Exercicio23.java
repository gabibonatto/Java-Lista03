import java.util.Scanner;

public class Exercicio23 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa em metros:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);
        double pesoIdeal = pessoa.calcularPesoIdeal();

        if (pesoIdeal != 0) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Peso ideal: " + pesoIdeal + " kg");
        } else {
            System.out.println("Dados inválidos para calcular o peso ideal.");
        }

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}

