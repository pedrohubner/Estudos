package com.semanatres.featuresnove;

public class Beta2 {
    public static void main(String[] args) {

        Estagiario e1 = new Estagiario("Pedro", 18, false);

        Pessoa p1 = new Pessoa() {
            @Override
            public String dizer() {
                return null;
            }
        };

        e1.expediente();

        //Implementando métodos privados dentro de métodos default
        p1.dizerOi();

        e1.setTrabalhando(true);

        //Implementando métodos privados dentro de métodos default
        System.out.println(p1.dizerTchau());

        e1.expediente();

    }
}
