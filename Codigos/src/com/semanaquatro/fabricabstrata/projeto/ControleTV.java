package com.semanaquatro.fabricabstrata.projeto;

public class ControleTV implements Controle {

    @Override
    public void botao(){
        System.out.println("Aperte o botão do controle para ligar a TV.");
    }
}
