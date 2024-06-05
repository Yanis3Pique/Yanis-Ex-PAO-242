package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub4;

public final class Facultate {
    private final String denumireFacultate;
    private final int nrStudenti;
    private final String specializari;
    private final Adresa adresa;

    public Facultate(Adresa adresa, String denumireFacultate, int nrStudenti, String specializari) {
        this.adresa = new Adresa(adresa);
        this.denumireFacultate = denumireFacultate;
        this.nrStudenti = nrStudenti;
        this.specializari = specializari;
    }

    public Adresa getAdresa() {
        return new Adresa(adresa);
    }

    public String getDenumireFacultate() {
        return denumireFacultate;
    }

    public int getNrStudenti() {
        return nrStudenti;
    }

    public String getSpecializari() {
        return specializari;
    }
}
