package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub1;

class Grila4 {
    static String sir = "E";

    void A() {
        try {
            sir = sir + "A";
            B();
        } catch (Exception e) {
            sir = sir + "B";
        }
    }

    void B() throws Exception {
        try {
            sir = sir + "C";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            sir = sir + "D";
        }
    }

    void C() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        Grila4 ob = new Grila4();
        ob.A();
        System.out.println(sir);
    }
}
