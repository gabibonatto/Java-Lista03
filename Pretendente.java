public class Pretendente {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Pretendente(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoria() {
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco == 1) return "Categoria 1";
            else if (grupoRisco == 2) return "Categoria 2";
            else return "Categoria 3";
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco == 2) return "Categoria 2";
            else if (grupoRisco == 3) return "Categoria 3";
            else return "Categoria 4";
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco == 4) return "Categoria 4";
            else if (grupoRisco == 3) return "Categoria 3";
            else return "Categoria 5";
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco == 5) return "Categoria 5";
            else if (grupoRisco == 4) return "Categoria 4";
            else return "Categoria 6";
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco == 7) return "Categoria 7";
            else if (grupoRisco == 6) return "Categoria 6";
            else return "Categoria 8";
        } else {
            return "Pretendente não se enquadra em nenhuma categoria.";
        }
    }

    public String getNome() {
        return nome;
    }
}
