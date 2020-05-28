package com.semanaquatro.decorator;

public class Roupeiro extends DecoracaoQuarto {

    Roupeiro(Quarto quarto){
        super(quarto);
    }

    @Override
    public String decorar() {
        return quarto.decorar() + "\n" + addRoupeiro();
    }

    private String addRoupeiro(){
        return "Coloquei um roupeiro no meu quarto";
    }
}
