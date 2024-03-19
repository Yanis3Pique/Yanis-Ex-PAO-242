package lab4.AlDoileaEx.Modele;

import lab4.AlDoileaEx.Interfete.BankCard;

public class ShoppingMall {
    BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void achizitie(double amount) {
        bankCard.doTransaction(amount);
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }
}