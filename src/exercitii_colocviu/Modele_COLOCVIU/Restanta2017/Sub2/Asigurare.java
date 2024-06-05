package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub2;

import java.util.Objects;

public class Asigurare {
    private String tip;
    private String titular;
    private double valoare;
    private String localitate;

    public Asigurare(String tip, String titular, double valoare, String localitate) {
        this.tip = tip;
        this.titular = titular;
        this.valoare = valoare;
        this.localitate = localitate;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    @Override
    public String toString() {
        return "Asigurare{" +
                "tip='" + tip + '\'' +
                ", titular='" + titular + '\'' +
                ", valoare=" + valoare +
                ", localitate='" + localitate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asigurare asigurare = (Asigurare) o;
        return Double.compare(asigurare.valoare, valoare) == 0 &&
                Objects.equals(tip, asigurare.tip) &&
                Objects.equals(titular, asigurare.titular) &&
                Objects.equals(localitate, asigurare.localitate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tip, titular, valoare, localitate);
    }
}
