package com.semanaquatro.fabricabstrata.cliente;

import com.semanaquatro.fabricabstrata.fabrica.FabricaControle;
import com.semanaquatro.fabricabstrata.projeto.Controle;

public class ApertarBotao {

    private Controle controle;

    public ApertarBotao(FabricaControle fabrica) {
        controle = fabrica.criarBotao();
    }

    public void botao(){
        controle.botao();
    }

}
