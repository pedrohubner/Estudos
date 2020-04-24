package com.semanadois.projeto.threads;

public class AbleToRun implements Runnable {

    private String nome;

    public AbleToRun(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + nome + " está em " + i + " km");
        }{
            System.out.println("\nDONE! " + nome);
        }
    }
}
