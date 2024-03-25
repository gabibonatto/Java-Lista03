public class ContaDeLuz {
    private int tipoCliente;
    private double valorKWh;

    public ContaDeLuz(int tipoCliente) {
        this.tipoCliente = tipoCliente;
        definirValorKWh();
    }

    private void definirValorKWh() {
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                break;
        }
    }

    public double calcularValorConta(int consumoKWh) {
        return consumoKWh * valorKWh;
    }
}

