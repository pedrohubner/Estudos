package com.semanatres.featuresnove;

public class Estagiario implements Salario{

    private String nome;
    private int idade;
    private boolean trabalhando;

    public Estagiario(String nome, int idade, boolean trabalhando) {
        this.nome = nome;
        this.idade = idade;
        this.trabalhando = trabalhando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String expediente() {
        if (trabalhando)
            return nome + " está no trabalho.";
        else
            return nome + " voltou pra casa.";
    }
}
