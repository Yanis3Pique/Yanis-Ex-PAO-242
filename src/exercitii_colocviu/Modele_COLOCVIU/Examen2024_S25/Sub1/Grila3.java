package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub1;

class A {
    int x = 10;
    int f(int t) { return x + t; }
}

class B extends A {
    int x = 30;
    int f(int t) { return x + 10 * t; }
}

public class Grila3 {
    public static void main(String[] args) {
        A ob = new B();
        System.out.println(ob.f(ob.x));
    }
}

