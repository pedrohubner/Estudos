package com.playground.exercicios3;

public class Carro implements Runnable{

    private String carro;
    private int tempo;

    public Carro(String carro, int tempo){

        this.carro = carro;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(carro + " está passando pelo km " + i);
                Corredores.sleep(tempo);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(carro + " terminou a corrida!");
    }
}
