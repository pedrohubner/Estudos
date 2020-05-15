package com.semanaquatro.decorando;

public class Cama extends DecoracaoQuarto{


    Cama(Quarto quarto){
        super(quarto);
    }

    @Override
    public String decorar() {
        quarto.decorar();
        return addCama();
    }

    private String addCama(){
        return "Coloquei uma cama no meu quarto.";
    }
}
