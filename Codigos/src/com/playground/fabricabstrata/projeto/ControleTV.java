package com.playground.fabricabstrata.projeto;

import com.playground.fabricabstrata.projeto.Controle;

public class ControleTV implements Controle {

    @Override
    public void botao(){
        System.out.println("Aperte o botão para ligar a TV.");
    }
}
