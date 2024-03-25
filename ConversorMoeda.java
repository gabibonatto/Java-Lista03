public class ConversorMoeda {
    private double cotacaoDolar;

    public ConversorMoeda(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterParaReal(double quantidadeDolar) {
        return quantidadeDolar * cotacaoDolar;
    }
}

