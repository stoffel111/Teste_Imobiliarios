package modelo;

import java.util.LinkedList;

public class Imobiliaria<TImovelImobiliaria extends ImovelImobiliaria> extends ComValor implements RepositorioLinkedList<TImovelImobiliaria> {
    protected long numero;
    private final GestorLinkedList gestorLinkedList;

    public Imobiliaria(long numero) {
        super(0);
        this.numero = numero;
        this.gestorLinkedList = new GestorLinkedList();
    }

    public long getNumero() {
        return numero;
    }

    @Override
    public void adicionar(TImovelImobiliaria imovel) {
        this.gestorLinkedList.adicionar(imovel);
        valor += imovel.getValor();
    }

    @Override
    public double getMenorValor() {
        return this.gestorLinkedList.getMenorValor();
    }

    @Override
    public LinkedList<TImovelImobiliaria> getImoveis() {
        return this.gestorLinkedList.getImoveis();
    }
}
