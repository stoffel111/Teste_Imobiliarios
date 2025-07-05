package modelo;

import java.util.LinkedList;

public interface RepositorioLinkedList<TImovel extends Imovel> {
    void adicionar(TImovel imovel);

    double getMenorValor();

    LinkedList<TImovel> getImoveis();
}
