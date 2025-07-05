package modelo;

public class ComValor {
    protected double valor;

    public ComValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ComValor{" +
                "valor=" + valor +
                '}';
    }
}
