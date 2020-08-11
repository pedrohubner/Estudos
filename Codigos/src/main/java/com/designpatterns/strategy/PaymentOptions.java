package com.designpatterns.strategy;

public abstract class PaymentOptions {

    private Double purchaseValue;
    private String destination;

    PaymentOptions(Double purchaseValue, String destination) {
        this.purchaseValue = purchaseValue;
        this.destination = destination;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    protected String purchaseInvoice() {
        return "Destinatário: " + destination + "\nValor: " + purchaseValue;
    }
}
