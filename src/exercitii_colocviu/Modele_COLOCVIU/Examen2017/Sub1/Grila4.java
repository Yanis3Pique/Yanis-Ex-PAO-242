package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub1;

class A {
    public int x = 1;
    void afisare() { System.out.println(x+10); }
}

class B extends A {
    public int x = 2;
    void afisare() { System.out.println(x); }
}

public class Grila4 {
    public static void main(String[] args) {
        A ob = new B();
        ++ob.x;
        ob.afisare();
    }
}