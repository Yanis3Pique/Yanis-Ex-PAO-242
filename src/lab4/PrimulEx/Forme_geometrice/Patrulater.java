package lab4.PrimulEx.Forme_geometrice;

import lab4.PrimulEx.Interfete.Calcul;

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

