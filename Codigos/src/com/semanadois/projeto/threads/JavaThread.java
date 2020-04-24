package com.semanadois.projeto.threads;

public class JavaThread extends Thread {

    public JavaThread(String nome){
       super(nome);
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("\n"+getName() + " está em " + i + " km");
        } try {
            sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e){
            System.out.println("Não começou a corrida");
        }

        System.out.println("\nDONE! " + getName());
    }
}
