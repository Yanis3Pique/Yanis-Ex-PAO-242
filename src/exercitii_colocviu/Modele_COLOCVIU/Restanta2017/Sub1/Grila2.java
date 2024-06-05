package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub1;

class CC {
    public static void met() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.print("M");
        }
    }
}

public class Grila2 {
    public static void main(String[] args) {
        try {
            CC.met();
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("F");
        }
        System.out.println("T");
    }
}

