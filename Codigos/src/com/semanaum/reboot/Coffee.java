package com.semanaum.refazendo;

public class Coffee {

    protected boolean chaleira;

    public Coffee(boolean chaleira) {
        this.chaleira = chaleira;
    }

    protected String fazerCafe(int colheresCafe, double litrosAgua) {
        if (!chaleira) {
            return "Adicionar " + colheresCafe + " colheres de café, mais "
            + litrosAgua + "l de água e ligar chaleira.";
        } else
            return "Café já está sendo feito.";
    }


}
