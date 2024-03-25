public class CalculadoraValorVenda {
    public static double calcularValorVenda(double precoCusto, double percentualLucro) {
        double valorVenda = precoCusto * (1 + percentualLucro / 100);
        return valorVenda;
    }
}
