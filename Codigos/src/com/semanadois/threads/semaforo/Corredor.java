package com.semanadois.threads.semaforo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Corredor implements Runnable{

    Semaphore sem;
    private String nome;

    public Corredor(Semaphore sem, String nome){
        this.sem = sem;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Semaphore getSem() {
        return sem;
    }

    @Override
    public void run() {

        //Corredor 1
        System.out.println("\n" + nome + " entra no estádio");

        try {
            System.out.println(nome + " está esperando o início da corrida");

            sem.acquire();

            System.out.println(nome + " começa a correr\n");

            for (int i = 0; i <= 10; i++){

                System.out.println(nome + ":" + i + "km");

                Thread.sleep(100);
            }
            System.out.println("\n" + nome + " conclui corrida");

        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            System.out.println("Pátio vazio");
            sem.release();
        }

    }
}
