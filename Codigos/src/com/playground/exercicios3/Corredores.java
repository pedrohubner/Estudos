package com.playground.exercicios3;

public class Corredores extends Thread {

    private String nome;
    private int tempo;

    public Corredores(String nome, int tempo){

        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public synchronized void run() {
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(nome + " está passando pelo km " + i);
                Corredores.sleep(tempo);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a corrida!");
    }
}
