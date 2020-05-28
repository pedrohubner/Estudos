package com.semanadois.threads.semaforo;

import java.util.concurrent.Semaphore;

public class Corrida {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);

        Corredor corredor1 = new Corredor(sem, "Pedro");
        Corredor corredor2 = new Corredor(sem, "Luana");

        corredor1.run();
        corredor2.run();
    }
}
