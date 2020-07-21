package com.designpatterns.abstractfactory.fabrica;

import com.designpatterns.abstractfactory.projeto.Controle;
import com.designpatterns.abstractfactory.projeto.ControlePortao;

public class FabricaControlePortao implements FabricaControle {

    @Override
    public Controle criarControle() {
        return new ControlePortao();
    }
}
