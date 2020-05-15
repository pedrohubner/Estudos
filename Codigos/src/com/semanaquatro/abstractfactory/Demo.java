package com.semanaquatro.abstractfactory;

import com.semanaquatro.abstractfactory.cliente.ApertarBotao;
import com.semanaquatro.abstractfactory.fabrica.FabricaControle;
import com.semanaquatro.abstractfactory.fabrica.FabricaControlePortao;
import com.semanaquatro.abstractfactory.fabrica.FabricaControleTV;
import com.semanaquatro.abstractfactory.fabrica.FabricaControleVideoGame;

public class Demo {

    public static ApertarBotao pegandoControle(){
        ApertarBotao ab;
        FabricaControle prototipo;

        String tipoBotao = System.getProperty("key", "videogame");
        if (tipoBotao.contains("videogame")) {
            prototipo = new FabricaControleVideoGame();
            ab = new ApertarBotao(prototipo);
        } else if (tipoBotao.contains("tv")){
            prototipo = new FabricaControleTV();
            ab = new ApertarBotao(prototipo);
        } else {
            prototipo = new FabricaControlePortao();
            ab = new ApertarBotao(prototipo);
        }
        return ab;
    }

    public static void main(String[] args) {
        ApertarBotao ab = pegandoControle();
        ab.botao();
    }
}
