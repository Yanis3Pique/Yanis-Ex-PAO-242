package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub3;

import java.util.Objects;

public class DiplomaLicenta {
    private String serie;
    private String absolvent;
    private int an;
    private String facultate;
    private String specializare;
    private float medie;

    public DiplomaLicenta(String serie, String absolvent, int an, String facultate, String specializare, float medie) {
        this.serie = serie;
        this.absolvent = absolvent;
        this.an = an;
        this.facultate = facultate;
        this.specializare = specializare;
        this.medie = medie;
    }

    // Getters and setters
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAbsolvent() {
        return absolvent;
    }

    public void setAbsolvent(String absolvent) {
        this.absolvent = absolvent;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "DiplomaLicenta{" +
                "serie='" + serie + '\'' +
                ", absolvent='" + absolvent + '\'' +
                ", an=" + an +
                ", facultate='" + facultate + '\'' +
                ", specializare='" + specializare + '\'' +
                ", medie=" + medie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiplomaLicenta that = (DiplomaLicenta) o;
        return an == that.an &&
                Float.compare(that.medie, medie) == 0 &&
                Objects.equals(serie, that.serie) &&
                Objects.equals(absolvent, that.absolvent) &&
                Objects.equals(facultate, that.facultate) &&
                Objects.equals(specializare, that.specializare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serie, absolvent, an, facultate, specializare, medie);
    }
}
