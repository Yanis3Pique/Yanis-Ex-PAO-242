package lab7;

public class User {
    private String nume;
    private String prenume;
    private String iban;

    public User(String nume, String prenume, String iban) {
        this.nume = nume;
        this.prenume = prenume;
        this.iban = iban;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getIban() {
        return iban;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "User: " + "nume=" + nume + ", prenume=" + prenume + ", iban=" + iban + '\n';
    }
}
