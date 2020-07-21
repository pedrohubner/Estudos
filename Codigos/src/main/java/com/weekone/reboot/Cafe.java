package com.weekone.reboot;

public class Cafe {

    private final Boolean chaleiraLigada;

    Cafe(Boolean chaleiraLigada) {
        this.chaleiraLigada = chaleiraLigada;
    }

    protected String fazerCafe(Integer colheresCafe, Double litrosAgua) {
        if (!chaleiraLigada) {
            return "Adicionar " + colheresCafe + " colheres de café, mais "
                    + litrosAgua + "l de água e ligar chaleira.";
        } else
            return "Café já está sendo feito.";
    }
}
