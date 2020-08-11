package com.designpatterns.strategy;

public class Purchase {
    public static void main(String[] args) {

        Payment creditCardPurchase = new Payment(new CreditCard(24.,
                "Gravataí", 2, 16151419, "Visa"));

        Payment debitCardPurchase = new Payment(new DebitCard(25.,
                "PoA", 256485L, "20/11/2020"));

        System.out.println();
        System.out.println(creditCardPurchase.selectPaymentOption());

        System.out.println();
        System.out.println(debitCardPurchase.selectPaymentOption());
    }
}
