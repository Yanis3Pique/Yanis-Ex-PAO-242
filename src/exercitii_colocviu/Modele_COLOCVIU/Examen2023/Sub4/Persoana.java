package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub4;

import java.util.Objects;

public class Persoana {
    private String nume;
    private int varsta;
    private double venitAnual;

    public Persoana(String nume, int varsta, double venitAnual) {
        this.nume = nume;
        this.varsta = varsta;
        this.venitAnual = venitAnual;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getVenitAnual() {
        return venitAnual;
    }

    public void setVenitAnual(double venitAnual) {
        this.venitAnual = venitAnual;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", venitAnual=" + venitAnual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && Double.compare(persoana.venitAnual, venitAnual) == 0 && Objects.equals(nume, persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, venitAnual);
    }
}
