package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub1;

import java.util.TreeMap;

public class Grila1 {
    public static void main(String[] args) {
        TreeMap<String, String> m = new TreeMap<>();
        m.put("c", "JavaSE");
        m.put("a", null);
        m.put("b", "JavaSE");
        m.put("c", "Python");
        m.put("a", "C++");
        System.out.println(m);
    }
}