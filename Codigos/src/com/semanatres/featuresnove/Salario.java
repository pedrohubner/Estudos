package com.semanatres.featuresnove;


public interface Pessoa {

    private String dizerOi() {
        return "Oi, tudo bem?";
    }

    private String dizerTchau() {
        return "Até mais, se cuida!";
    }

    default String chegarNoTrabalho() {
        return dizerOi();
    }

    default String irEmbora() {
        return dizerTchau();
    }
}
