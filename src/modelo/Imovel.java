package modelo;

public abstract class Imovel extends ComValor {
    protected String identificacao;

    public Imovel(String identificacao, double valor) {
        super(valor);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "identificacao='" + identificacao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
