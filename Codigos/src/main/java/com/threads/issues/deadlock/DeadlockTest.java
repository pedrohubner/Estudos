package com.threads.issues.deadlock;

public class DeadlockTest {
    public static void main(String[] args) {

        ElementA elementA = new ElementA(1);
        ElementB elementB = new ElementB(1);

        Thread t1 = new Thread(() -> {
            synchronized (elementA) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (elementB) {
                    System.out.println("In block 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (elementB) {
                synchronized (elementA) {
                    System.out.println("In block 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}