package com.playground.tarefa;

public class Cidade {

    private String nomeCidade;

    Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    String getNomeCidade() {
        return nomeCidade;
    }

    @Override
    public String toString() {
        return "Cidade: " + nomeCidade;
    }
}
