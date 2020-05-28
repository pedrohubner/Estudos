package com.playground.cadastro;

class Cidades {

    protected int codigo;
    protected String descricao;
    protected String uf;
    protected int qntdEstudantes;

    Cidades(int codigo, String descricao, String uf, int qntdEstudantes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.qntdEstudantes = qntdEstudantes;
    }

    int getCodigo() {
        return codigo;
    }

    String getDescricao() {
        return descricao;
    }

    String getUf() {
        return uf;
    }

    String exibeDados() {
        return "A cidade " + descricao + ", do estado " + uf;
    }

    int getQntdEstudantes() {
        return qntdEstudantes;
    }

    void addNovoEstudante() {
    }
}