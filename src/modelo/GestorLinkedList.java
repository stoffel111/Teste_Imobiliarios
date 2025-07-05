package modelo;

import java.util.LinkedList;

public class GestorLinkedList<TImovel extends ComValor> {
    LinkedList<TImovel> imoveis;

    public GestorLinkedList() {
        this.imoveis = new LinkedList<>();
    }


    public void adicionar(TImovel imovel) {
        imoveis.add(imovel);
    }


    public double getMenorValor() {
        if (imoveis.isEmpty()) {
            return 0;
        }
        double menorValor = imoveis.get(0).getValor();
        for (int i = 1; i < imoveis.size(); i++) {
            if (imoveis.get(i).getValor() < menorValor) {
                menorValor = imoveis.get(i).getValor();
            }
        }
        return menorValor;
    }


    public LinkedList<TImovel> getImoveis() {
        return new LinkedList<TImovel>(imoveis);
    }
}