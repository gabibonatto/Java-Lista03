import java.util.Scanner;

public class Programa {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o número do exercicio: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
              Exercicio1.executar();
                break;
            case 2:
                Exercicio2.executar();
                break;
            case 3:
                Exercicio3.executar();
                break;
            case 4:
                Exercicio4.executar();
                break;
            case 5:
                Exercicio5.executar();
                break;
            case 6:
                Exercicio6.executar();
                break;
            case 7:
                Exercicio7.executar();
                break;
            case 8:
                Exercicio8.executar();
                break;
            case 9:
                Exercicio9.executar();
                break;
            case 10:
                Exercicio10.executar();
                break;
            case 11:
                Exercicio11.executar();
                break;
            case 12:
                Exercicio12.executar();
                break;
            case 13:
                Exercicio13.executar();
                break;
            case 14:
                Exercicio14.executar();
                break;
            case 15:
                Exercicio15.executar();
                break;
            case 16:
                Exercicio16.executar();
                break;
            case 17:
                Exercicio17.executar();
                break;
            case 19:
                Exercicio19.executar();
                break;
            case 20:
                Exercicio20.executar();
                break;
            case 21:
                Exercicio21.executar();
                break;
            case 22:
                Exercicio22.executar();
                break;
            case 23:
                Exercicio23.executar();
                break;
            case 24:
                Exercicio24.executar();
                break;
            case 25:
                Exercicio25.executar();
                break;
            case 26:
                Exercicio26.executar();
                break;
            default:    
                System.out.println("Exercicio não encontrado.");
                break;
        }
        scanner.close();
    }
}
