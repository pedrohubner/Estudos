package com.semanaquatro.fabricabstrata.fabrica;

import com.semanaquatro.fabricabstrata.projeto.Controle;
import com.semanaquatro.fabricabstrata.projeto.ControleVideoGame;

public class FabricaControleVideoGame implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleVideoGame();
    }
}
