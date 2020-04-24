package com.semanadois.projeto.threads;

public class Teste {
    public static void main(String[] args) throws Exception{

        System.out.println("\n===== Corrida até 9 KM =====\n");

        AbleToRun a = new AbleToRun("Naã");

        Thread t1 = new Thread(a);

        JavaThread t2 = new JavaThread("Lauren");
        JavaThread t3 = new JavaThread("Elise");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        }catch (InterruptedException e){
            System.out.println("Corrida interrompida");
        }

    }
}
