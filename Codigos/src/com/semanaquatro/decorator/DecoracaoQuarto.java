package com.semanaquatro.decorando;

public class DecoracaoQuarto extends Quarto {

    Quarto quarto;

    DecoracaoQuarto(Quarto quarto){
        this.quarto = quarto;
    }

    @Override
    public String decorar() {
        return null;
    }
}
