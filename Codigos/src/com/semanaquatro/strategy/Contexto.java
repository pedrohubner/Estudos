package com.semanaquatro.strategy;

public class Contexto {

    private Opcoes opcoes;

    Contexto(Opcoes opcoes) {
        this.opcoes = opcoes;
    }

    String selecionarOpcao(){
        return opcoes.notaFiscal();
    }
}
