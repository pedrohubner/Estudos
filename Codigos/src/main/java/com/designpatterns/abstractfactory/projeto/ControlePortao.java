package com.designpatterns.abstractfactory.projeto;

public class ControlePortao implements Controle {

    @Override
    public void botao(){
        System.out.println("Aperte o botão do controle para abrir o portão.");
    }
}
