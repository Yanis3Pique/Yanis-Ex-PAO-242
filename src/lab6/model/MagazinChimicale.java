package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class MagazinChimicale implements FunctieGenericaChirie {
    @Override
    public int functieChirie(int x) {
        return 4 * x;
    }
}
