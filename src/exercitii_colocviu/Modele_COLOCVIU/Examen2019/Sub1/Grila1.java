package exercitii_colocviu.Modele_COLOCVIU.Examen2019.Sub1;

import java.util.HashSet;

class Automobil {
    private String marca;

    public Automobil(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class Grila1 {
    public static void main(String[] args) {
        HashSet<Automobil> la = new HashSet<>();
        la.add(new Automobil("Audi"));
        la.add(new Automobil("BMW"));
        la.add(new Automobil("Audi"));
        la.add(new Automobil("Opel"));
        System.out.println(la.size());
    }
}
