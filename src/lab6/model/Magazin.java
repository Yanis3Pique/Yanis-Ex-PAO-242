package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class Magazin {
    private String id;
    private String numeMagazin;
    private Proprietar proprietar;
    private int venit;
    private int suprafata;
    private int chirie;

    public Magazin(String id, String numeMagazin, Proprietar proprietar, int venit, int suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public String getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public int getVenit() {
        return venit;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int setChirie(FunctieGenericaChirie fg) {
        this.chirie = fg.functieChirie(suprafata);
        return this.chirie;
    }

    public int getChirie() {
        return chirie;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public void setVenit(int venit) {
        this.venit = venit;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }
}
