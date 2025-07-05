package modelo;

import java.util.LinkedList;

public class ImobiliariaTerrenos extends Imobiliaria<Terreno> {

    public ImobiliariaTerrenos(long numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "Imobiliaria de terrenos: "+numero+" com valor: "+ valor +"€";
    }
}
