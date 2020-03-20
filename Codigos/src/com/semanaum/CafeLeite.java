package com.semanaum;

public class CafeLeite extends Cafe {

    private int leite;
    private int gelo;



    public CafeLeite (int leite, boolean chaleira, int colheres, double agua, boolean termica, int acucar,
                      int adocante, int gelo){

        super(termica, colheres, chaleira, agua, acucar, adocante);
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
