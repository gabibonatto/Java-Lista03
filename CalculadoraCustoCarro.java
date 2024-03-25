public class CalculadoraCustoCarro {
    public static double calcularCustoConsumidor(double custoFabrica) {
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;
        
        double custoImpostos = custoFabrica * impostos;
        double custoComImpostos = custoFabrica + custoImpostos;
        double custoConsumidor = custoComImpostos * (1 + percentualDistribuidor);
        
        return custoConsumidor;
    }
}
