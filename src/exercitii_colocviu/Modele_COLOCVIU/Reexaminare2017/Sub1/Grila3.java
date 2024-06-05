package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub1;

class C {
    public static void met_1() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.print("A");
        }
    }

    public static void met_2() throws Exception {
        try {
            met_1();
        } catch (Exception ex) {
            System.out.print("B");
        }
    }
}

public class Grila3 {
    public static void main(String[] args) {
        try {
            C.met_2();
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        System.out.println("E");
    }
}
