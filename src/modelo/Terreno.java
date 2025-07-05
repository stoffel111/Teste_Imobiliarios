package modelo;

public class Terreno extends ImovelImobiliaria {

    public Terreno(String identificacao, double valor) {
        super(identificacao, valor);
    }

    @Override
    public String toString() {
        return " no terreno: " + super.toString();
    }
}
