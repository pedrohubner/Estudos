package com.semanaum.reboot;

public class CafeAdocante extends Coffee implements Adocante {

    private int gotasAdocante;

    CafeAdocante(boolean chaleira, int gotasAdocante) {
        super(chaleira);
        this.gotasAdocante = gotasAdocante;
    }

    @Override
    protected String fazerCafe(int colheresCafe, double litrosAgua) {
        return super.fazerCafe(colheresCafe, litrosAgua) + adicionarAdocante();
    }

    @Override
    public String adicionarAdocante() {
        return "\nE adicionar " + gotasAdocante + " gotas de adoçante.";
    }
}
