package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub4;

public class Adresa {
    private String strada;
    private int numar;
    private String bloc;
    private String scara;
    private int etaj;
    private int apartament;
    private String judet;
    private String localitate;

    public Adresa(Adresa adresaX) {
        this.apartament = adresaX.getApartament();
        this.bloc = adresaX.getBloc();
        this.etaj = adresaX.getEtaj();
        this.judet = adresaX.getJudet();
        this.localitate = adresaX.localitate;
        this.numar = adresaX.getNumar();
        this.scara = adresaX.getScara();
        this.strada = adresaX.getStrada();
    }

    public Adresa(int apartament, String bloc, int etaj, String judet, String localitate, int numar, String scare, String strada) {
        this.apartament = apartament;
        this.bloc = bloc;
        this.etaj = etaj;
        this.judet = judet;
        this.localitate = localitate;
        this.numar = numar;
        this.scara = scare;
        this.strada = strada;
    }

    public int getApartament() {
        return apartament;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scare) {
        this.scara = scare;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }
}
