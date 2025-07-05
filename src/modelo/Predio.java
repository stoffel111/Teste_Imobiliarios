package modelo;

import java.util.LinkedList;

public class Predio extends ImovelImobiliaria implements RepositorioLinkedList<Apartamento> {
    private final GestorLinkedList gestorLinkedList;
    private Terreno terreno;

    public Predio(String identificacao, Terreno terreno) {
        super(identificacao, terreno.getValor());
        this.terreno = terreno;
        this.gestorLinkedList = new GestorLinkedList<>();
    }

    @Override
    public void adicionar(Apartamento apartamento) {
        gestorLinkedList.adicionar(apartamento);
        valor += apartamento.getValor();
    }

    @Override
    public double getMenorValor() {
        return gestorLinkedList.getMenorValor();
    }

    @Override
    public LinkedList<Apartamento> getImoveis() {
        return gestorLinkedList.getImoveis();
    }

    @Override
    public String toString() {
        return "Prédio: " + super.toString() + " no terreno: " + terreno.getIdentificacao();
    }
}
