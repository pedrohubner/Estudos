package com.threads.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable {

    private final AtomicInteger number;

    Counter() {
        this.number = new AtomicInteger(0);
    }

    public Integer getNumber() {
        return number.get();
    }

    public Integer increaseNumber() {
        return number.getAndIncrement();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            increaseNumber();
        }
    }
}
