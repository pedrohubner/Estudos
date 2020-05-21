package com.semanaum.refazendo;

public class CafeAcucar extends Coffee implements Acucar{

    public CafeAcucar(boolean chaleira) {
        super(chaleira);
    }

    @Override
    protected String fazerCafe(int colheresCafe, double litrosAgua) {
        return super.fazerCafe(colheresCafe, litrosAgua) + adicionarAcucar(2);
    }

    @Override
    public String adicionarAcucar(int colheresAcucar) {
        return "Adicionar " + colheresAcucar + " colheres de açucar no café.";
    }
}
