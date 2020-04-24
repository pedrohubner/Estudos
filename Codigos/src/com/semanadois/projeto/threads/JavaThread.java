package com.semanadois.projeto.threads;

public class JavaThread extends Thread {

    public JavaThread(String nome){
       super(nome);
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("\n"+getName() + " está em " + i + " km");
        }

        System.out.println("\nDONE! " + getName());
    }
}
