package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub1;

interface Functie {
    int f(double x);
    default boolean eval(double x) { return f(x) == x; }
}

public class Grila5 {
    Functie rf;
    public Grila5(Functie rf) { this.rf = rf; }
    public boolean eval(double x) { return rf.f(x) == x; }

    public static void main(String[] args) {
        boolean b1 = new Grila5(x -> 10).eval(10);
//        boolean b2 = new Grila5(x -> x / 100).eval(10);
        boolean b3 = new Functie() { public int f(double x) { return (int)(x / 10); } }.eval(10);
    }
}