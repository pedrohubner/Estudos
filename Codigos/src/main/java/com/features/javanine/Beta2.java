package com.features.javanine;

public class Beta2 {
    public static void main(String[] args) {

        Estagiario e1 = new Estagiario("Pedro", 18, true);

        System.out.println(e1.expediente());

        e1.setTrabalhando(false);

        System.out.println(e1.expediente());

        System.out.println(e1.entrarSalario(0, 1010));

    }
}
