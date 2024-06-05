package exercitii_colocviu.Laboratoare.lab4;

public class Application {
    public static void main(String[] args) {
        Cerc c1 = new Cerc(2);
        Patrat p1 = new Patrat(2);

        System.out.println(c1.calculPermimetru());
        System.out.println(p1.calculPermimetru());
    }
}
