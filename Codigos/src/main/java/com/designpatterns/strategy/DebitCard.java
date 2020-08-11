package com.designpatterns.strategy;

public class DebitCard extends PaymentOptions {

    private Long code;
    private String date;

    DebitCard(Double purchaseValue, String destination, Long code, String date) {
        super(purchaseValue, destination);
        this.code = code;
        this.date = date;
    }

    public long getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    @Override
    protected String purchaseInvoice() {
        return "====Boleto===="
                + "\nCódigo: " + code
                + "\n" + super.purchaseInvoice()
                + "\nData: " + date;
    }
}
