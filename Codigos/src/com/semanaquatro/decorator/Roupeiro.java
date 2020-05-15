package com.semanaquatro.decorando;

public class Roupeiro extends DecoracaoQuarto {

    Roupeiro(Quarto quarto){
        super(quarto);
    }

    @Override
    public String decorar() {
        quarto.decorar();
        return addRoupeiro();
    }

    private String addRoupeiro(){
        return "Coloquei um roupeiro no meu quarto";
    }
}
