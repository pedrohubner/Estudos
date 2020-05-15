package com.semanaquatro.decorando;

public class Roupeiro extends DecoracaoQuarto {

    public Roupeiro(Quarto quarto){
        super(quarto);
    }

    @Override
    public void decorar() {
        addRoupeiro();
        quarto.decorar();
    }

    public void addRoupeiro(){
        System.out.println("Coloquei um roupeiro no meu quarto");
    }
}
