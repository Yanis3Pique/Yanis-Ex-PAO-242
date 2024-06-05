package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class MagazinChimicale extends Magazin implements FunctieGenericaChirie {

    public MagazinChimicale(String id, String numeMagazin, Proprietar proprietar, int venit, int suprafata) {
        super(id, numeMagazin, proprietar, venit, suprafata);
    }

    @Override
    public int functieChirie(int x) {
        return 4 * x;
    }
}
