package com.semanaum;

import com.semanaum.Cafe;

public class CafeLeite extends Cafe implements Adocar {

    private int leite;
    private int gelo;

    public CafeLeite (int leite, boolean chaleira, int colheres, double agua, boolean termica, int acucar,
                      int adocante, int gelo){

        super(chaleira, colheres, termica, agua, acucar, adocante);
        this.leite = leite;
        this.gelo = gelo;
    }

    public int getGelo(){
        return gelo++;
    }

    public int setGelo(int gelo){
        return this.gelo = gelo;
    }

    public int getLeite(){
        return leite;
    }

    public int colocarLeite() {
        return leite++;
    }

    @Override
    public void colocarAdocante(){
        getAdocante();
    }

    @Override
    public void colocarAcucar(){}
}
