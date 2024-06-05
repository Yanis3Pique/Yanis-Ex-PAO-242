package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub1;

class C1 {
    public int a;
    public static int b;

    public C1() {
        b++;
        b = b + a;
    }

    public void met() {
        a = a + b;
        a++;
    }
}

public class Grila1 {
    public static void main(String[] args) {
        C1 ob1 = new C1();
        ob1.met();
        C1 ob2 = new C1();
        ob2.met();
        System.out.println(ob1.a + ob2.b);
    }
}

