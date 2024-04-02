package lab6.model;

import lab6.interfete.FunctieGenericaChirie;

public class MagazinAlimentar implements FunctieGenericaChirie {
    @Override
    public int functieChirie(int x) {
        return 2 * x;
    }
}
