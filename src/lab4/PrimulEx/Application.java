package lab4.PrimulEx;

import lab4.PrimulEx.Forme_geometrice.*;

public class Application {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(2.5);
        Patrulater patrulater = new Patrulater(4.7, 10.3);

        System.out.println("Perimetrul cercului este = " + cerc.calculeazaPerimetru());
        System.out.println("Perimetrul patrulaterului este = " + patrulater.calculeazaPerimetru());
    }
}