package com.semanadois.projeto;

import java.util.concurrent.Semaphore;

public class JavaThreads {
    public static void main(String[] args) {

        Semaphore tes = new Semaphore(2);

        int a = 2;
        int b = 2;

        int soma = a + b;

//        Thread t1 = new Thread(tes, soma);
    }
}
