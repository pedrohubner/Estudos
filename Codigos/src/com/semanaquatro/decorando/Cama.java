package com.semanaquatro.decorando;

public class Cama extends DecoracaoQuarto{


    public Cama(Quarto quarto){
        super(quarto);
    }

    @Override
    public void decorar() {
        addCama();
        quarto.decorar();
    }

    public void addCama(){
        System.out.println("Coloquei uma cama no meu quarto.");
    }

    @Override
    public String toString() {
        return "\nO que achou?";
    }
}
