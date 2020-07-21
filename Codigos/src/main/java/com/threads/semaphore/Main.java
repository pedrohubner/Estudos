package com.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        Client c1 = new Client("Samuel");
        Client c2 = new Client("Viviane");
        Client c3 = new Client("Davi");
        Client c4 = new Client("Pedro");

        Market m1 = new Market(c1, semaphore, 1000);
        Market m2 = new Market(c2, semaphore, 1000);
        Market m3 = new Market(c3, semaphore, 1000);
        Market m4 = new Market(c4, semaphore, 1000);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        Thread t4 = new Thread(m4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
