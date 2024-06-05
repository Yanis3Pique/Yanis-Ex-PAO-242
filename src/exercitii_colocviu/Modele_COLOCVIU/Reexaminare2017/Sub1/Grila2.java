package exercitii_colocviu.Modele_COLOCVIU.Reexaminare2017.Sub1;

public class Grila2 {
    public static void main(String[] args) {
        String s = "academician";
        int p = s.lastIndexOf("c");
        int q = s.indexOf(s.charAt(p));
        s = s.substring(q, p);
        System.out.println(s);
    }
}

