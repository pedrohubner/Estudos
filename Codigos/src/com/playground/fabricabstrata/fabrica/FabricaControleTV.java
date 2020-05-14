package com.playground.fabricabstrata.fabrica;

import com.playground.fabricabstrata.projeto.Controle;
import com.playground.fabricabstrata.projeto.ControleTV;

public class FabricaControleTV implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleTV();
    }
}
