package com.playground.tarefa;

public class Cidades {

    protected int codigo;
    protected String descricao;
    protected String uf;

    protected Cidades(int codigo, String descricao, String uf){
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getUf(){
        return uf;
    }

    public void exibeDados(){
        System.out.println("A cidade " + descricao + ", do estado " + uf);
    }

    @Override
    public String toString() {
        return descricao;
    }

    public void addNovoEstudante() {
    }
}