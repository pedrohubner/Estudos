package com.threads.semaphore;

public class Client {

    private final String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
