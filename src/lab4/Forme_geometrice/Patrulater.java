package lab4.Forme_geometrice;

import lab4.Interfete.Calcul;

public class Patrulater implements Calcul {
    private double L;
    private double l;

    public Patrulater(double L, double l) {
        this.L = L;
        this.l = l;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    @Override
    public double calculeazaPerimetru() {
        return (2 * L + 2 * l);
    }
}

