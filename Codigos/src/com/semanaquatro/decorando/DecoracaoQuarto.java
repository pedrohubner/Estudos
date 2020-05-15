package com.semanaquatro.decorando;

public class DecoracaoQuarto extends Quarto {

    protected Quarto quarto;

    public DecoracaoQuarto(Quarto quarto){
        this.quarto = quarto;
    }

    @Override
    public void decorar() {
    }
}
