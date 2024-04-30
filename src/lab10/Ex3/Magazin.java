package lab10.Ex3;

//3. Se defineste o lista de obiecte Magazin
//Magazin are: numeMagazin, numarAngajati
//
//sa se afiseze magazinele grupate by numarAngajati
//sa se afiseze suma angajatilor din toate magazinele

public class Magazin {
    private String numeMagazin;
    private int numarAngajati;

    public Magazin(String numeMagazin, int numarAngajati) {
        this.numeMagazin = numeMagazin;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "numeMagazin='" + numeMagazin + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
