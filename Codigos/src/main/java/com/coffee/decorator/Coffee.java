package com.coffee.decorator;

public class Coffee extends Production {

    private final Boolean chaleiraLigada;

    Coffee(boolean chaleiraLigada) {
        this.chaleiraLigada = chaleiraLigada;
    }

    @Override
    protected String makeCoffee(Integer colheresCafe, Double litrosAgua) {
        if (!chaleiraLigada) {
            return "Adicionar " + colheresCafe + " colheres de café, mais "
                    + litrosAgua + "l de água e ligar chaleira.";
        } else
            return "Café já está sendo feito.";
    }
}
