package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub1;

class B {
    public B() {
        System.out.print("A");
    }

    public void met() {
        System.out.print("B");
    }
}

class C2 extends B {
    public C2() {
        System.out.print("C");
    }

    @Override
    public void met() {
        System.out.print("D");
    }
}

public class Grila4 {
    public static void main(String[] args) {
        B ob = new C2();
        ob.met();
    }
}
