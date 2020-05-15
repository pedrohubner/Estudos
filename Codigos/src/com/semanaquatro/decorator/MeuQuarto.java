package com.semanaquatro.decorator;

public class MeuQuarto {
    public static void main(String[] args) {

        Quarto meuQuarto = new Cama(new Roupeiro(new QuartoVazio()));

        System.out.println(meuQuarto.decorar());
    }
}
