package com.semanatres.featuresnove;


public interface Pessoa {

    default String dizer() {
        saudar();
        return dizer();
    }

    default void dizerOi() {
        saudar();
    }

    default String dizerTchau() {
        return darTchau();
    }

    private void saudar() {
        System.out.println("Oi, tudo bem?");
    }

    //Método privado sendo implementado nos métodos default acima
    private String darTchau() {
        return "Até mais, se cuida!";

    }
}
