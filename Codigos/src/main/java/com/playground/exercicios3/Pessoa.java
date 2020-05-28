package com.playground.exercicios3;

public class Pessoa {

    private String nome;
    private int num;

    public Pessoa(String nome, int num){
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String alteraNome(){
        nome = "John";
        return nome;
    }

    @Override
    public String toString() {
        return nome + " " + num;
    }
}
