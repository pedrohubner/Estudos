package com.weekone.project;

public abstract class Cafe implements Adocar {

    //atributos
    private boolean chaleira;
    private int colheres;
    private double agua;
    private boolean termica;
    private int acucar;
    private int adocante;
    private static boolean xicara;

    // Construtor classe pai
    Cafe (boolean termica, int colheres, boolean chaleira, double agua, int acucar, int adocante){

        this.termica = termica;
        this.agua = agua;
        this.chaleira = chaleira;
        this.colheres = colheres;
        this.acucar = acucar;
        this.adocante = adocante;
    }

    // Getters and Setters
    public boolean getXicara(){
        return xicara;
    }

    public int getAdocante(){
        return adocante++;
    }

    public int setAdocante(int adocante){
        return this.adocante = adocante;
    }

    public int getAcucar(){
        return acucar++;
    }

    public int setAcucar(int acucar) {
        return this.acucar = acucar;
    }

    public boolean getChaleira() {
        return chaleira;
    }

    public int getColheres() {
        return colheres++;
    }

    public int setColheres(int colheres){
        return this.colheres = colheres;
    }

    public double getAgua() {
        return agua;
    }

    public double setAgua(double agua){
        return this.agua = agua;
    }

    public boolean getTermica() {
        return termica;
    }

    // Métodos
    public int colocarColheres() {
        return colheres++;
    }

    public boolean chaleiraLigada(){
        return chaleira = true;
    }

    public boolean cafeNaTermica() {
        return termica = true;
    }

    // Método estático
    public static void servirXicara() {
        if (xicara = true) {
            System.out.println("Servir café na xícara");
        }
    }

    //Método abstrato
    public abstract void colocarAcucar();

    //Método implementado da interface "com.semanaum.semanaum.Adocar.java"
    public void colocarAdocante() {
        getAdocante();
    }
}
