package com.weekone.reboot;

public class CafeAdocante extends Cafe implements Adocante {

    private final Integer gotasAdocante;

    CafeAdocante(Boolean chaleira, Integer gotasAdocante) {
        super(chaleira);
        this.gotasAdocante = gotasAdocante;
    }

    @Override
    protected String fazerCafe(Integer colheresCafe, Double litrosAgua) {
        return super.fazerCafe(colheresCafe, litrosAgua) + adicionarAdocante();
    }

    @Override
    public String adicionarAdocante() {
        return "\nE adicionar " + gotasAdocante + " gotas de adoçante.";
    }
}
