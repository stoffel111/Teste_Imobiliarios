package modelo;

public class Apartamento extends Imovel {
    private Predio predio;
    private int permilagem;

    public Apartamento(Predio predio, String identificacao, int permilagem, double valor) {
        super(identificacao, valor);
        this.predio = predio;
        this.permilagem = permilagem;
    }

    public Predio getPredio() {
        return predio;
    }

    public double getPermilagem() {
        return permilagem;
    }

    @Override
    public String toString() {
        return "Apartamento: " + super.toString() + " do prédio: " + predio.getIdentificacao()
                + " permilagem: " + permilagem;
    }
}
