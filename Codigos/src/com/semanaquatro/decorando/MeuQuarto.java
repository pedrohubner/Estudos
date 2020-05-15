package com.semanaquatro.decorando;

public class MeuQuarto {
    public static void main(String[] args) {

        Quarto meuQuarto = new Cama(new Roupeiro(new MontarQuarto()));

        System.out.println();
        meuQuarto.decorar();

        System.out.println(meuQuarto);
    }
}
