package com.playground.fabricabstrata.projeto;

import com.playground.fabricabstrata.projeto.Controle;

public class ControlePortao implements Controle {

    @Override
    public void botao(){
        System.out.println("Aperte o botão para abrir o portão.");
    }
}
