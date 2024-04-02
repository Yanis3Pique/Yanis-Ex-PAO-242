package lab6;

import lab6.model.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Proprietar proprietar1 = new Proprietar("Popa", "Ioan", 24);
        Proprietar proprietar2 = new Proprietar("Ionescu", "Mirela", 30);
        Proprietar proprietar3 = new Proprietar("Popa", "Adrian", 10);
        Proprietar proprietar4 = new Proprietar("Popa", "Mircea", 12);
        Proprietar proprietar5 = new Proprietar("Popa", "Mircea", 11);

        Magazin magazin1 = new Magazin("1", "Magazin1", proprietar1, 1000, 100);
        Magazin magazin2 = new Magazin("2", "Magazin2", proprietar1, 2000, 200);
        Magazin magazin3 = new Magazin("3", "Magazin3", proprietar1, 3000, 300);
        Magazin magazin4 = new Magazin("4", "Magazin4", proprietar2, 4000, 400);
        Magazin magazin5 = new Magazin("5", "Magazin5", proprietar3, 5000, 500);
        Magazin magazin6 = new Magazin("6", "Magazin6", proprietar4, 6000, 600);
        Magazin magazin7 = new Magazin("7", "Magazin7", proprietar5, 7000, 700);


        magazin1.setChirie(new MagazinAlimentar());
        magazin2.setChirie(new MagazinHaine());
        magazin3.setChirie(new MagazinChimicale());
        magazin4.setChirie(new MagazinAlimentar());
        magazin5.setChirie(new MagazinHaine());
        magazin6.setChirie(new MagazinChimicale());
        magazin7.setChirie(new MagazinChimicale());

        ShoppingMall shoppingMall = new ShoppingMall();
        shoppingMall.adaugaMagazin(magazin1);
        shoppingMall.adaugaMagazin(magazin2);
        shoppingMall.adaugaMagazin(magazin3);
        shoppingMall.adaugaMagazin(magazin4);
        shoppingMall.adaugaMagazin(magazin5);
        shoppingMall.adaugaMagazin(magazin6);
        shoppingMall.adaugaMagazin(magazin7);

        System.out.println("Nesortat qList:" + "\n" + shoppingMall.getListaMagazine());
        System.out.println();

        // lista de magazine sortata dupa: nume proprietar, prenume proprietar, chiria platita. Se foloseste Comparator.
        Collections.sort(shoppingMall.getListaMagazine(), Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume)
                        .thenComparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));
        System.out.println("qList sortat dupa numeProprietar, prenumeProprietar, chirie:" + "\n" + shoppingMall.getListaMagazine());
        System.out.println();

        // lista de magazine ale unui proprietar, afisare sortata dupa numeMagazin, venit, chirie, suprafata. Se foloseste Comparator.
        List<Magazin> magazineProprietar1 = shoppingMall.getMagazineProprietar(proprietar1);
        Collections.sort(magazineProprietar1, Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));
        System.out.println("Magazinele proprietarului 1 sortate dupa numeMagazin, venit, chirie, suprafata:" + "\n" + magazineProprietar1);
        System.out.println();

        // venitul total obtinut de un proprietar
        int venitTotalProprietar = 0;
        for (Magazin magazin : shoppingMall.getListaMagazine()) {
            if (magazin.getProprietar().equals(proprietar1)) {
                venitTotalProprietar += magazin.getVenit();
            }
        }
        System.out.println("Venitul total al proprietarului 1: " + venitTotalProprietar);
        System.out.println();

        // chiria totala platita de un proprietar
        int chirieTotalaProprietar = 0;
        for (Magazin magazin : shoppingMall.getListaMagazine()) {
            if (magazin.getProprietar().equals(proprietar1)) {
                chirieTotalaProprietar += magazin.getChirie();
            }
        }
        System.out.println("Chiria totala a proprietarului 1: " + chirieTotalaProprietar);
        System.out.println();
    }
}