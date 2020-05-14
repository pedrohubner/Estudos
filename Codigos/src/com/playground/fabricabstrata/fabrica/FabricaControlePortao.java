package com.playground.fabricabstrata.fabrica;

import com.playground.fabricabstrata.projeto.Controle;
import com.playground.fabricabstrata.projeto.ControlePortao;

public class FabricaControlePortao implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControlePortao();
    }
}
