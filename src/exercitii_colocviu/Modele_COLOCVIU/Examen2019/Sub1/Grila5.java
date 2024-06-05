package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub1;

public class Grila5 {
    static String sir = "A";

    void A() {
        try {
            sir = sir + "B";
            B();
        } catch (Exception e) {
            sir = sir + "C";
        }
    }

    void B() throws Exception {
        try {
            sir = sir + "D";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            sir = sir + "E";
        }
    }

    void C() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        Grila5 ob = new Grila5();
        ob.A();
        System.out.println(sir);
    }
}
