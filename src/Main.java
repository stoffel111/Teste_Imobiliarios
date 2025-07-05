import modelo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Terreno[] terrenos = {
                new Terreno("Ladeira", 10000),
                new Terreno("Penha", 100000),
                new Terreno("Colina", 500000),
        };

        Predio[] predios = {
                new Predio("Sonho", terrenos[1]),
                new Predio("Boa Vista", terrenos[2]),
        };

        Apartamento[] apartamentos = {
                new Apartamento(predios[0], "1A", 250, 300000),
                new Apartamento(predios[0], "1B", 200, 200000),
                new Apartamento(predios[1], "1", 500, 500000),
        };
        for (Apartamento apartamento : apartamentos) {
            apartamento.getPredio().adicionar(apartamento);
        }

        ImobiliariaTerrenos imobiliariaTerrenos = new ImobiliariaTerrenos(111000);
        for (Terreno terreno : terrenos) {
            imobiliariaTerrenos.adicionar(terreno);
        }

        ImobiliariaPredios imobiliariaPredios = new ImobiliariaPredios(238400);
        for (Predio predio : predios) {
            imobiliariaPredios.adicionar(predio);
        }

        for (Predio predio : predios) {
            System.out.println("Apartamento de menor valor de " + predio +
                    "\n = " + predio.getMenorValor() + '€');
        }

        System.out.println("Terreno de menor valor de " + imobiliariaTerrenos +
                "\n = " + imobiliariaTerrenos.getMenorValor() + '€');
        System.out.println("Prédio de menor valor de " + imobiliariaPredios +
                "\n = " + imobiliariaPredios.getMenorValor() + '€');
    }
}