package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub1;

class A {
    public static void metoda(String s) {
        System.out.print("A" + s);
    }

//    public void metoda(String s, String t) {
//        System.out.print("A" + s + t);
//    }
}

class B extends A {
    public static void metoda(String s) {
        System.out.print("B" + s);
    }

    public void metoda(String s, String t) {
        System.out.print("B" + s + t);
    }
}

public class Grila3 {
    public static void main(String[] args) {
        A ob = new B();
        ob.metoda("P");
//        ob.metoda("Q", "R"); ---> Aici da eroare de compilare
    }
}
