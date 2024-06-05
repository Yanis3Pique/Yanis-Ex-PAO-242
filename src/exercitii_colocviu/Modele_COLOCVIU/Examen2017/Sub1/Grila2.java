package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub1;

class Test2 {
    String str = "a";

    void A() {
        try {
            str += "b"; B();
        } catch (Exception e) {
            str += "c";
        }
    }

    void B() throws Exception {
        try {
            str += "d"; C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }
        str += "f";
    }

    void C() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        Test2 ob = new Test2();
        ob.A();
        System.out.println(ob.str);
    }
}

