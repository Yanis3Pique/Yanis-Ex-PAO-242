package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub1;

class B {
    static String x = "";

    public static void met_1() {
        x = x + "A";
    }

    public void met_2() {
        x = x + "B";
    }
}

class CCC extends B {
    public static void met_1() {
        x = x + "C";
    }

    public void met_2() {
        x = x + "D";
    }
}

public class Grila4 {
    public static void main(String[] args) {
        B ob = new CCC();
        ob.met_1();
        ob.met_2();
        System.out.println(ob.x);
    }
}
