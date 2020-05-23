package com.semanaquatro.abstractfactory.cliente;

import com.semanaquatro.abstractfactory.fabrica.FabricaControle;
import com.semanaquatro.abstractfactory.projeto.Controle;

public class Botao {

    private Controle controle;

    public Botao(FabricaControle fabrica) {
        controle = fabrica.criarControle();
    }

    public void apertarBotao(){
        controle.botao();
    }

}
