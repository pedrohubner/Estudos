package com.semanaquatro.decorator;

public class Cama extends DecoracaoQuarto{


    Cama(Quarto quarto){
        super(quarto);
    }

    @Override
    public String decorar() {
        return quarto.decorar() + "\n" + addCama();
    }

    private String addCama(){
        return "Coloquei uma cama no meu quarto.";
    }
}
