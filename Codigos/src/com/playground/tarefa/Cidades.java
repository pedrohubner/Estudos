package com.playground.tarefa;

public class Cidades {

    private int codigo;
    private String descricao;
    private String uf;
    private int qntdEstudantes;

    Cidades(int codigo, String descricao, String uf, int qntdEstudantes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.qntdEstudantes = qntdEstudantes;
    }

    protected int getCodigo() {
        return codigo;
    }

    protected String getDescricao() {
        return descricao;
    }

    protected String getUf() {
        return uf;
    }

    public String exibeDados() {
        return "A cidade " + descricao + ", do estado " + uf;
    }

    public int getQntdEstudantes() {
        return qntdEstudantes;
    }

    @Override
    public String toString() {
        return descricao;
    }

    void addNovoEstudante() {
    }
}