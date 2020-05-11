package com.playground.tarefa1;

public class Relogio {
    public static void main(String[] args) {

        Engrenagem e1 = new Engrenagem();

        System.out.println("\nIniciando cronômetro: \n");

        while (true) {
            System.out.print(e1.cronometrar());
        }
    }
}
