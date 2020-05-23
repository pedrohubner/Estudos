package com.semanaquatro.abstractfactory.fabrica;

import com.semanaquatro.abstractfactory.projeto.Controle;
import com.semanaquatro.abstractfactory.projeto.ControlePortao;

public class FabricaControlePortao implements FabricaControle {

    @Override
    public Controle criarControle() {
        return new ControlePortao();
    }
}
