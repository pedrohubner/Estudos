package com.threads.issues.racecondition;

public class Counter implements Runnable {

    private Integer number;

    Counter() {
        this.number = 0;
    }

    public Integer getNumber() {
        return number;
    }

    public void increaseNumber() {
        number++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increaseNumber();
        }
    }
}
