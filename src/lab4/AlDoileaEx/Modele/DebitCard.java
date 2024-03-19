package lab4.AlDoileaEx.Modele;

import lab4.AlDoileaEx.Interfete.BankCard;

public record DebitCard(String utilizator, double limitAmount) implements BankCard {
    private static double spentAmount = 0;

    @Override
    public void doTransaction(double amount) {
        if (spentAmount + amount > limitAmount) {
            System.out.println("Not enough money for " + utilizator);
            return;
        }
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
    }
}
