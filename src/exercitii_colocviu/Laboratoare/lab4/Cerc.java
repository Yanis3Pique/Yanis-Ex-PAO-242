package exercitii_colocviu.Laboratoare.lab4;

public class Cerc implements Calcul {
    double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculPermimetru() {
        return 2 * Math.PI * raza;
    }
}
