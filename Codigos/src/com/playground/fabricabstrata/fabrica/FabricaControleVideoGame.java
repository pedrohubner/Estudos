package com.playground.fabricabstrata.fabrica;

import com.playground.fabricabstrata.projeto.Controle;
import com.playground.fabricabstrata.projeto.ControleVideoGame;

public class FabricaControleVideoGame implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleVideoGame();
    }
}
