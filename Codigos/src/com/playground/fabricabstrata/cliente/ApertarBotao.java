package com.playground.fabricabstrata.cliente;

import com.playground.fabricabstrata.fabrica.FabricaControle;
import com.playground.fabricabstrata.projeto.Controle;

public class ApertarBotao {

    private Controle controle;

    public ApertarBotao(FabricaControle fabrica) {
        controle = fabrica.criarBotao();
    }

    public void botao(){
        controle.botao();
    }

}
