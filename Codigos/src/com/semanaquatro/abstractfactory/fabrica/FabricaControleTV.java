package com.semanaquatro.abstractfactory.fabrica;

import com.semanaquatro.abstractfactory.projeto.Controle;
import com.semanaquatro.abstractfactory.projeto.ControleTV;

public class FabricaControleTV implements FabricaControle {

    @Override
    public Controle criarBotao() {
        return new ControleTV();
    }
}
