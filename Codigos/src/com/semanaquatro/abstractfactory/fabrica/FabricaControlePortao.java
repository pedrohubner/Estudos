package com.semanaquatro.fabricabstrata.fabrica;

import com.semanaquatro.fabricabstrata.projeto.Controle;
import com.semanaquatro.fabricabstrata.projeto.ControlePortao;

public class FabricaControlePortao implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControlePortao();
    }
}
