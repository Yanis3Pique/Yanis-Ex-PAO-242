package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub2;

import java.util.Objects;

class TenisATP {
    private String numeJucator;
    private String nationalitateJucator;
    private int pozitieATP;
    private int puncteATP;
    private int nrTurneeATP;

    public TenisATP(String numeJucator, String nationalitateJucator, int pozitieATP, int puncteATP, int nrTurneeATP) {
        this.numeJucator = numeJucator;
        this.nationalitateJucator = nationalitateJucator;
        this.pozitieATP = pozitieATP;
        this.puncteATP = puncteATP;
        this.nrTurneeATP = nrTurneeATP;
    }

    // Getters and Setters
    public String getNumeJucator() {
        return numeJucator;
    }

    public void setNumeJucator(String numeJucator) {
        this.numeJucator = numeJucator;
    }

    public String getNationalitateJucator() {
        return nationalitateJucator;
    }

    public void setNationalitateJucator(String nationalitateJucator) {
        this.nationalitateJucator = nationalitateJucator;
    }

    public int getPozitieATP() {
        return pozitieATP;
    }

    public void setPozitieATP(int pozitieATP) {
        this.pozitieATP = pozitieATP;
    }

    public int getPuncteATP() {
        return puncteATP;
    }

    public void setPuncteATP(int puncteATP) {
        this.puncteATP = puncteATP;
    }

    public int getNrTurneeATP() {
        return nrTurneeATP;
    }

    public void setNrTurneeATP(int nrTurneeATP) {
        this.nrTurneeATP = nrTurneeATP;
    }

    @Override
    public String toString() {
        return "TenisATP{" +
                "numeJucator='" + numeJucator + '\'' +
                ", nationalitateJucator='" + nationalitateJucator + '\'' +
                ", pozitieATP=" + pozitieATP +
                ", puncteATP=" + puncteATP +
                ", nrTurneeATP=" + nrTurneeATP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TenisATP tenisATP = (TenisATP) o;
        return pozitieATP == tenisATP.pozitieATP &&
                puncteATP == tenisATP.puncteATP &&
                nrTurneeATP == tenisATP.nrTurneeATP &&
                Objects.equals(numeJucator, tenisATP.numeJucator) &&
                Objects.equals(nationalitateJucator, tenisATP.nationalitateJucator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeJucator, nationalitateJucator, pozitieATP, puncteATP, nrTurneeATP);
    }
}