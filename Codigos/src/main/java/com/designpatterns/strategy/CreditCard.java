package com.designpatterns.strategy;

public class CreditCard extends PaymentOptions {

    private Integer plots;
    private Integer cardNumber;
    private String flag;

    CreditCard(Double purchaseValue, String destination, Integer plots,
               Integer cardNumber, String flag) {
        super(purchaseValue, destination);
        this.plots = plots;
        this.cardNumber = cardNumber;
        this.flag = flag;
    }

    public Integer getPlots() {
        return plots;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public String getFlag() {
        return flag;
    }

    private String plotPayment() {
        return Messages.message(this);
    }

    @Override
    protected String purchaseInvoice() {
        return "====Cartão de Crédito===="
                + "\nNúmero cartão: " + cardNumber
                + "\nBandeira: " + flag
                + "\n" + super.purchaseInvoice()
                + "\n" + plotPayment();
    }
}
