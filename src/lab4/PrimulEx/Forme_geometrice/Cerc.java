package lab4.PrimulEx.Forme_geometrice;

import lab4.PrimulEx.Interfete.Calcul;

public class Cerc implements Calcul {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculeazaPerimetru() {
        return 2 * Math.PI * raza;
    }
}
