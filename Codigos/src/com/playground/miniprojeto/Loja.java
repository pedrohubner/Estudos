package com.playground.miniprojeto;

public class Loja {

    private String nome;
    private String endereco;
    private long contato;

    public Loja(String nome, String endereco, long contato){
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getContato() {
        return contato;
    }

    public void setContato(long contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Loja " + nome + " fica na " + endereco;
    }
}
