package com.weekone.project;

public class Mocaccino extends Cafe {

    private int chocolate;
    private String colher;
    private String mexer;

    Mocaccino(int chocolate, boolean termica, int colheres, boolean chaleira, double agua, int acucar,
                     int adocante, String colher, String mexer){
        super(termica, colheres, chaleira, agua, acucar, adocante);
        this.chocolate = chocolate;
        this.colher = colher;
        this.mexer = mexer;
    }

    public int getChocolate(){
        return chocolate;
    }
    public int setChocolate(int chocolate){
        return this.chocolate = chocolate;
    }

    public String getColher(){
        return "Peguei a colher";
    }

    public String setColher(String colher){
        return this.colher = colher;
    }

    public String getMexer(){
        return " e agora vou mexer meu café";
    }

    public String setMexer(String mexer){
        return this.mexer = mexer;
    }

    public void mexerColher(String colher){
        System.out.println(getColher());
    }

    public void mexerColher(String colher, String mexer){
        System.out.println(getColher() + getMexer());
    }

    @Override
    public void colocarAdocante(){}

    @Override
    public void colocarAcucar() {
        chocolate++;
    }
}