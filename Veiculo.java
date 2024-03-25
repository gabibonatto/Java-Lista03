public class Veiculo {
    private String combustivel;
    private double valorVeiculo;

    public Veiculo(String combustivel, double valorVeiculo) {
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    public double calcularDesconto() {
        double desconto;
        switch (combustivel) {
            case "álcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                desconto = 0;
        }
        return desconto;
    }

    public double calcularValorFinal() {
        return valorVeiculo - calcularDesconto();
    }
}
