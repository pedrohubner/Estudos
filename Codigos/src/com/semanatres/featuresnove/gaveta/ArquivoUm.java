package com.semanatres.featuresnove.gaveta;

public class ArquivoUm {
    public static void main(String[] args) {

        GerenciadorDeArquivos g1 = new GerenciadorDeArquivos();

        g1.criarArquivo();

        g1.EscreverArquivo();

        g1.LerArquivo();
    }
}
