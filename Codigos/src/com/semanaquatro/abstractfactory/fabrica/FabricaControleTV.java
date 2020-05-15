package com.semanaquatro.fabricabstrata.fabrica;

import com.semanaquatro.fabricabstrata.projeto.Controle;
import com.semanaquatro.fabricabstrata.projeto.ControleTV;

public class FabricaControleTV implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleTV();
    }
}
