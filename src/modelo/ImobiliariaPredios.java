package modelo;

import java.util.LinkedList;

public class ImobiliariaPredios extends Imobiliaria<Predio> {

    public ImobiliariaPredios(long numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "Imobiliaria de terrenos: "+numero+" com valor: "+ valor +"€";
    }
}
