package com.semanadois.projeto.threads;

public class Teste {
    public static void main(String[] args) {

        System.out.println("\n=====Corrida até 9 KM=====\n");

        new JavaThread("Lauren").start();
        new JavaThread("Elise").start();

        AbleToRun e = new AbleToRun("Naã");

        Thread t1 = new Thread(e);

        t1.start();

    }
}
