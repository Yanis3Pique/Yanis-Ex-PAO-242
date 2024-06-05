package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub3;

import java.util.Objects;

public class Vacanta {
    private String destinatie;
    private int nr_persoane;
    private double valoare;
    private String perioada;

    public Vacanta(String destinatie, int nr_persoane, double valoare, String perioada) {
        this.destinatie = destinatie;
        this.nr_persoane = nr_persoane;
        this.valoare = valoare;
        this.perioada = perioada;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public int getNr_persoane() {
        return nr_persoane;
    }

    public void setNr_persoane(int nr_persoane) {
        this.nr_persoane = nr_persoane;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public String getPerioada() {
        return perioada;
    }

    public void setPerioada(String perioada) {
        this.perioada = perioada;
    }

    @Override
    public String toString() {
        return "Vacanta{" +
                "destinatie='" + destinatie + '\'' +
                ", nr_persoane=" + nr_persoane +
                ", valoare=" + valoare +
                ", perioada='" + perioada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacanta vacanta = (Vacanta) o;
        return nr_persoane == vacanta.nr_persoane &&
                Double.compare(vacanta.valoare, valoare) == 0 &&
                Objects.equals(destinatie, vacanta.destinatie) &&
                Objects.equals(perioada, vacanta.perioada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinatie, nr_persoane, valoare, perioada);
    }
}
