package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class MagazinHaine implements FunctieGenericaChirie {
    @Override
    public int functieChirie(int x) {
        return 3 * x;
    }
}
