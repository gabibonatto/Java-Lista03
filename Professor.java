public class Professor {
    private int nivel;

    public Professor(int nivel) {
        this.nivel = nivel;
    }

    public double calcularSalario(int horasAula) {
        double valorHoraAula;
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                valorHoraAula = 0.00;
        }
        return valorHoraAula * horasAula;
    }
}
