package com.designpatterns.strategy;

public class Messages {

    static String message(CreditCard creditCard) {
        if (creditCard.getPlots() <= 10 && creditCard.getPlots() != 0)
            return "Pagamento parcelado em " + creditCard.getPlots() + "x. Valor mensal: "
                    + (creditCard.getPurchaseValue() / creditCard.getPlots());
        else if (creditCard.getPlots() >= 11 && creditCard.getPlots() <= 12) {
            return "Pagamento parcelado em " + creditCard.getPlots() + "x. Valor mensal com juros: " +
                    (creditCard.getPurchaseValue() / creditCard.getPlots() + 10.0);
        } else
            return "Opcção não disponível";
    }
}
