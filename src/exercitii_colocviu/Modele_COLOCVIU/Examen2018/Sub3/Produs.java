package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub3;

import java.io.Serializable;
import java.util.Objects;

public class Produs implements Serializable {
    private String firma;
    private String produs;
    private float cantitate;
    private float pretUnitar;

    public Produs(String firma, String produs, float cantitate, float pretUnitar) {
        this.firma = firma;
        this.produs = produs;
        this.cantitate = cantitate;
        this.pretUnitar = pretUnitar;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getProdus() {
        return produs;
    }

    public void setProdus(String produs) {
        this.produs = produs;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    public float getPretUnitar() {
        return pretUnitar;
    }

    public void setPretUnitar(float pretUnitar) {
        this.pretUnitar = pretUnitar;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "firma='" + firma + '\'' +
                ", produs='" + produs + '\'' +
                ", cantitate=" + cantitate +
                ", pretUnitar=" + pretUnitar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs1 = (Produs) o;
        return Float.compare(produs1.cantitate, cantitate) == 0 &&
                Float.compare(produs1.pretUnitar, pretUnitar) == 0 &&
                Objects.equals(firma, produs1.firma) &&
                Objects.equals(produs, produs1.produs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firma, produs, cantitate, pretUnitar);
    }
}