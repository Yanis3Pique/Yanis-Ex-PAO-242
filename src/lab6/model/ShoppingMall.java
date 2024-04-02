package lab6.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {
    private List<Magazin> listaMagazine = new ArrayList<>();

    public void adaugaMagazin(Magazin magazin) {
        listaMagazine.add(magazin);
    }

    public void stergeMagazin(Magazin magazin) {
        listaMagazine.remove(magazin);
    }

    public List<Magazin> getListaMagazine() {
        return listaMagazine;
    }

    public List<Magazin> getMagazineProprietar(Proprietar proprietar1) {
        List<Magazin> magazineProprietar = new ArrayList<>();
        for (Magazin magazin : listaMagazine) {
            if (magazin.getProprietar().equals(proprietar1)) {
                magazineProprietar.add(magazin);
            }
        }
        return magazineProprietar;
    }
}
