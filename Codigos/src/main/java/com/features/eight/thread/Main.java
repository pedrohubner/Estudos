package com.features.eight.thread;

public class Main {
    public static void main(String[] args) {

        Math number = new Math();

        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                number.increaseNumber();
            }
        });

        t.start();
    }
}
