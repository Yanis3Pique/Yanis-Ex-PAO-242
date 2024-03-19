package lab4.AlDoileaEx;

import lab4.AlDoileaEx.Interfete.BankCard;
import lab4.AlDoileaEx.Modele.*;

public class Application {
    public static void main(String[] args) {
        BankCard debitCard = new DebitCard("Lionel Messi", 10000.0);
        ShoppingMall mall = new ShoppingMall(debitCard);

        mall.achizitie(1000);

        BankCard creditCard = new CreditCard("Luis Suarez");
        mall.setBankCard(creditCard);
        mall.achizitie(5000);

        mall.setBankCard(debitCard);
        mall.achizitie(10000);

        BankCard debitCard2 = new DebitCard("Yanis", 99000.0);
        mall.setBankCard(debitCard2);
        mall.achizitie(250);
    }
}
