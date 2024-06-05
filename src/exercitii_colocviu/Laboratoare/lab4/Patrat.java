package exercitii_colocviu.Laboratoare.lab4;

public class Patrat implements Calcul {
    double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculPermimetru() {
        return 4 * latura;
    }
}
