package com.designpatterns.abstractfactory.fabrica;

import com.designpatterns.abstractfactory.projeto.Controle;
import com.designpatterns.abstractfactory.projeto.ControleVideoGame;

public class FabricaControleVideoGame implements FabricaControle {

    @Override
    public Controle criarControle() {
        return new ControleVideoGame();
    }
}
