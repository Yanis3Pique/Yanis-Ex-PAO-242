package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub1;

class A {
    int x = 0;
    public A(int n) { x = n; }
}

class B extends A {
    int x = 1;
    public B(int n) { super(n); }
}

public class Grila2 {
    public static void main(String[] args) {
        A a = new A(5);
        B b = new B(7);
        System.out.println(a.x + " " + b.x);
    }
}

