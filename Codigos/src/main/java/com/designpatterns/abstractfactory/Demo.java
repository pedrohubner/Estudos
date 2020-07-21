package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.cliente.Botao;
import com.designpatterns.abstractfactory.fabrica.FabricaControle;
import com.designpatterns.abstractfactory.fabrica.FabricaControlePortao;
import com.designpatterns.abstractfactory.fabrica.FabricaControleTV;
import com.designpatterns.abstractfactory.fabrica.FabricaControleVideoGame;

public class Demo {

    public static Botao pegandoControle(){
        Botao botao;
        FabricaControle prototipo;

        String tipoBotao = System.getProperty("key", "tv");
        if (tipoBotao.contains("videogame")) {
            prototipo = new FabricaControleVideoGame();
            botao = new Botao(prototipo);
        } else if (tipoBotao.contains("tv")){
            prototipo = new FabricaControleTV();
            botao = new Botao(prototipo);
        } else {
            prototipo = new FabricaControlePortao();
            botao = new Botao(prototipo);
        }
        return botao;
    }

    public static void main(String[] args) {
        Botao botao = pegandoControle();
        botao.apertarBotao();
    }
}
