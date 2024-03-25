import java.util.Scanner;

public class Exercicio13 {
    public static void Programa () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastrar?");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        int totalAptas = 0;
        int totalInaptas = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Sexo (M/F):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Idade:");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Possui boa saúde? (true/false):");
            boolean saude = scanner.nextBoolean();
            scanner.nextLine(); 

            PessoaCadastro pessoa = new PessoaCadastro(nome, sexo, idade, saude);

            if (pessoa.estaAptaServicoMilitar()) {
                System.out.println("Está apta para o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println("Não está apta para o serviço militar obrigatório.");
                totalInaptas++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);

        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
