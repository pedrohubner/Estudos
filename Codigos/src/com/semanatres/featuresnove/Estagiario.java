package com.semanatres.featuresnove;

public class Estagiario implements Pessoa{

    private String nome;
    private int idade;
    private boolean trabalhando = true;

    public Estagiario(String nome, int idade, boolean trabalhando){
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

    public void expediente(){

        if(!trabalhando){
            System.out.println(nome + " está no trabalho.");
        }else System.out.println(nome + " voltou pra casa.");
    }

    @Override
    public String dizer() {
        return null;
    }

    @Override
    public void dizerOi () {

    }

    @Override
    public String dizerTchau() {
        return null;
    }
}
