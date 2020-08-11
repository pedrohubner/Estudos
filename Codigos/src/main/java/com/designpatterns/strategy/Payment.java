package com.designpatterns.strategy;

public class Payment {

    private PaymentOptions paymentOptions;

    Payment(PaymentOptions paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    String selectPaymentOption() {
        return paymentOptions.purchaseInvoice();
    }
}
