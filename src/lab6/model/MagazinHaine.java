package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class MagazinHaine extends Magazin implements FunctieGenericaChirie {

    public MagazinHaine(String id, String numeMagazin, Proprietar proprietar, int venit, int suprafata) {
        super(id, numeMagazin, proprietar, venit, suprafata);
    }

    @Override
    public int functieChirie(int x) {
        return 3 * x;
    }
}
