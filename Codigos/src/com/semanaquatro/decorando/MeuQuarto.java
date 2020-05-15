package com.semanaquatro.decorando;

public class Beta5 {
    public static void main(String[] args) {

        Quarto meuQuarto = new Cama(new Roupeiro(new MontarQuarto()));

        System.out.println();
        meuQuarto.decorar();

        System.out.println(meuQuarto);
    }
}
