package com.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Market implements Runnable {

    private final Integer time;
    private final Client client;
    private final Semaphore semaphore;

    Market(Client client, Semaphore semaphore, Integer time) {
        this.client = client;
        this.semaphore = semaphore;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            System.out.println(client + " está esperando na fila do caixa");
            semaphore.acquire();
            System.out.println("Caixa chama cliente " + client);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(client + " terminou suas compras");
            System.out.println(client + " foi embora");
            semaphore.release();
        }
    }
}
