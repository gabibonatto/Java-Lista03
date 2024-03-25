public class Salario {
    public static double calcularReajuste(double salario, double salarioMinimo) {
        double novoSalario = salario + (salario * 0.1); // Aumento de 10%
        double reajuste = novoSalario - salario;
        return reajuste;
    }

    public static double calcularNovoSalario(double salario, double salarioMinimo) {
        return salario + calcularReajuste(salario, salarioMinimo);
    }
}
