package com.semanaquatro.fabricabstrata.projeto;

public class ControleVideoGame implements Controle {

    @Override
    public void botao() {
        System.out.println("Aperte o botão do controle para iniciar o VideoGame.");
    }
}
