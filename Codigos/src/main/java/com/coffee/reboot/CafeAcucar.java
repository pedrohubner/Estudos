package com.coffee.reboot;

public class CafeAcucar extends Cafe implements Acucar {

    private final Integer colheresAcucar;

    CafeAcucar(Boolean chaleira, Integer colheresAcucar) {
        super(chaleira);
        this.colheresAcucar = colheresAcucar;
    }

    @Override
    protected String fazerCafe(Integer colheresCafe, Double litrosAgua) {
        return super.fazerCafe(colheresCafe, litrosAgua) + adicionarAcucar();
    }

    @Override
    public String adicionarAcucar() {
        return "\nE adicionar " + colheresAcucar + " colheres de açucar no café.";
    }
}
