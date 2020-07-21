package com.designpatterns.abstractfactory.projeto;

public class ControleTV implements Controle {

    @Override
    public void botao(){
        System.out.println("Aperte o botão do controle para ligar a TV.");
    }
}
