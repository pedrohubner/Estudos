package com.semanaum.reboot;

public class CafeAcucar extends Coffee implements Acucar {

    private int colheresAcucar;

    CafeAcucar(boolean chaleira, int colheresAcucar) {
        super(chaleira);
        this.colheresAcucar = colheresAcucar;
    }

    @Override
    protected String fazerCafe(int colheresCafe, double litrosAgua) {
        return super.fazerCafe(colheresCafe, litrosAgua) + adicionarAcucar();
    }

    @Override
    public String adicionarAcucar() {
        return "\nE adicionar " + colheresAcucar + " colheres de açucar no café.";
    }
}
