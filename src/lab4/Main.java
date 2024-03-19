package lab4;

import lab4.Forme_geometrice.*;

public class Main {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(2.5);
        Patrulater patrulater = new Patrulater(4.7, 10.3);

        System.out.println("Perimetrul cercului este = " + cerc.calculeazaPerimetru());
        System.out.println("Perimetrul patrulaterului este = " + patrulater.calculeazaPerimetru());
    }
}