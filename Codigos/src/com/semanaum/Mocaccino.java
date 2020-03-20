package com.semanaum;

public class Mocaccino extends Cafe {

    private int chocolate;

    public Mocaccino(int chocolate, boolean termica, int colheres, boolean chaleira, double agua, int acucar,
                     int adocante){
        super(termica, colheres, chaleira, agua, acucar, adocante);
        this.chocolate = chocolate;
    }

    public int getChocolate(){
        return chocolate;
    }
    public int setChocolate(int chocolate){
        return this.chocolate = chocolate;
    }

    @Override
    public void colocarAdocante(){}

    @Override
    public void colocarAcucar() {
        chocolate++;
    }
}