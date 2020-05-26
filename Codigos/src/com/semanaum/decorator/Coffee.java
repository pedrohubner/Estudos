package com.semanaum.decorator;

public class Coffee extends Production {

    private boolean chaleiraLigada;

    Coffee(boolean chaleiraLigada) {
        this.chaleiraLigada = chaleiraLigada;
    }

    @Override
    protected String makeCoffee(int colheresCafe, double litrosAgua) {
        if (!chaleiraLigada) {
            return "Adicionar " + colheresCafe + " colheres de café, mais "
                    + litrosAgua + "l de água e ligar chaleira.";
        } else
            return "Café já está sendo feito.";
    }
}
