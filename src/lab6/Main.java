package lab6;

import lab6.model.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Initialize proprietari
        Proprietar proprietar1 = new Proprietar("Popa", "Ioan", 24);
        Proprietar proprietar2 = new Proprietar("Ionescu", "Mirela", 30);
        Proprietar proprietar3 = new Proprietar("Popa", "Adrian", 10);
        Proprietar proprietar4 = new Proprietar("Popa", "Mircea", 12);
        Proprietar proprietar5 = new Proprietar("Popa", "Mircea", 11);

        // Initialize magazine
        Magazin[] magazine = {
                new Magazin("1", "Magazin1", proprietar1, 1000, 100),
                new Magazin("2", "Magazin2", proprietar1, 2000, 200),
                new Magazin("3", "Magazin3", proprietar1, 3000, 300),
                new Magazin("4", "Magazin4", proprietar2, 4000, 400),
                new Magazin("5", "Magazin5", proprietar3, 5000, 500),
                new Magazin("6", "Magazin6", proprietar4, 6000, 600),
                new Magazin("7", "Magazin7", proprietar5, 7000, 700)
        };

        ShoppingMall shoppingMall = new ShoppingMall();

        for (Magazin magazin : magazine) {
            shoppingMall.adaugaMagazin(magazin);
        }

        printUnsortedList(shoppingMall);
        sortAndPrintMagazineList(shoppingMall);
        sortAndPrintMagazineByProprietar(shoppingMall, proprietar1);
        printTotalVenitByProprietar(shoppingMall, proprietar1);
        printTotalChirieByProprietar(shoppingMall, proprietar1);
    }

    private static void printUnsortedList(ShoppingMall shoppingMall) {
        System.out.println("Nesortat qList:\n" + shoppingMall.getListaMagazine() + "\n");
    }

    private static void sortAndPrintMagazineList(ShoppingMall shoppingMall) {
        Collections.sort(shoppingMall.getListaMagazine(), Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume)
                        .thenComparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));
        System.out.println("qList sortat dupa numeProprietar, prenumeProprietar, chirie:\n" + shoppingMall.getListaMagazine() + "\n");
    }

    private static void sortAndPrintMagazineByProprietar(ShoppingMall shoppingMall, Proprietar proprietar) {
        List<Magazin> magazineProprietar = shoppingMall.getMagazineProprietar(proprietar);
        Collections.sort(magazineProprietar, Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));
        System.out.println("Magazinele proprietarului sortate dupa numeMagazin, venit, chirie, suprafata:\n" + magazineProprietar + "\n");
    }

    private static void printTotalVenitByProprietar(ShoppingMall shoppingMall, Proprietar proprietar) {
        int venitTotal = shoppingMall.getListaMagazine().stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getVenit)
                .sum();
        System.out.println("Venitul total al proprietarului: " + venitTotal + "\n");
    }

    private static void printTotalChirieByProprietar(ShoppingMall shoppingMall, Proprietar proprietar) {
        int chirieTotala = shoppingMall.getListaMagazine().stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getChirie)
                .sum();
        System.out.println("Chiria totala a proprietarului: " + chirieTotala + "\n");
    }
}