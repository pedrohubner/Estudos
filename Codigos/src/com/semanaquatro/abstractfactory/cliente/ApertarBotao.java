package com.semanaquatro.abstractfactory.cliente;

import com.semanaquatro.abstractfactory.fabrica.FabricaControle;
import com.semanaquatro.abstractfactory.projeto.Controle;

public class ApertarBotao {

    private Controle controle;

    public ApertarBotao(FabricaControle fabrica) {
        controle = fabrica.criarBotao();
    }

    public void botao(){
        controle.botao();
    }

}
