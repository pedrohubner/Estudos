package com.semanaquatro.abstractfactory.fabrica;

import com.semanaquatro.abstractfactory.projeto.Controle;
import com.semanaquatro.abstractfactory.projeto.ControleVideoGame;

public class FabricaControleVideoGame implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleVideoGame();
    }
}
