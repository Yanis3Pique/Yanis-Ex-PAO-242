package exercitii_colocviu.Modele_COLOCVIU.Examen2024_S25.Sub1;

import java.io.IOException;
import java.util.HashSet;

class A1A {
    int val;
    public A1A(int val) { this.val = val; }
    public boolean equals(Object obj) { return val != ((A1A)obj).val; }
    public int hashCode() { return val / 100; }
}

public class Grila2 {
    public static void main(String[] args) throws IOException {
        HashSet<A1A> hs = new HashSet<>();
        hs.add(new A1A(100));
        hs.add(new A1A(10));
        hs.add(new A1A(1));
        hs.add(new A1A(10));
        hs.add(new A1A(100));
        System.out.println(hs.size());
    }
}
