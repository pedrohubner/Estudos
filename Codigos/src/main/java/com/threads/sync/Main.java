package com.threads.sync;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getNumber());
    }
}
