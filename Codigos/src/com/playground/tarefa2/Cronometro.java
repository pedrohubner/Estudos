package com.playground.tarefa2;

import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("\nAté quantas horas você quer cronometrar: ");
        int hor = input.nextInt();

        if (hor > 60 || hor <= 0) {
            System.out.println("Não rola");
        } else {
            for (int hora = 0; hora < hor; hora++) {
                for (int minuto = 0; minuto < 60; minuto++) {
                    for (int segundo = 0; segundo < 60; segundo++) {
                        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                        Thread.sleep(1000);
                    }
                }
            }
            System.out.printf("%02d:00:00", hor);
        }
    }
}

