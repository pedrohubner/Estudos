package com.designpatterns.abstractfactory.cliente;

import com.designpatterns.abstractfactory.fabrica.FabricaControle;
import com.designpatterns.abstractfactory.projeto.Controle;

public class Botao {

    private Controle controle;

    public Botao(FabricaControle fabrica) {
        controle = fabrica.criarControle();
    }

    public void apertarBotao(){
        controle.botao();
    }

}
