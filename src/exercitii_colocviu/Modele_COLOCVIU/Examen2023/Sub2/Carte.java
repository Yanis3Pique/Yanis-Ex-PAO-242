package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub2;

import java.util.Objects;

public class Carte {
    String titlu;
    String autor;
    String editura;
    int nrExemplare;
    double pret;

    public Carte(String autor, String editura, int nrExemplare, double pret, String titlu) {
        this.autor = autor;
        this.editura = editura;
        this.nrExemplare = nrExemplare;
        this.pret = pret;
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getNrExemplare() {
        return nrExemplare;
    }

    public void setNrExemplare(int nrExemplare) {
        this.nrExemplare = nrExemplare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "autor='" + autor + '\'' +
                ", titlu='" + titlu + '\'' +
                ", editura='" + editura + '\'' +
                ", nrExemplare=" + nrExemplare +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return nrExemplare == carte.nrExemplare && Double.compare(pret, carte.pret) == 0 && Objects.equals(titlu, carte.titlu) && Objects.equals(autor, carte.autor) && Objects.equals(editura, carte.editura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, autor, editura, nrExemplare, pret);
    }
}
