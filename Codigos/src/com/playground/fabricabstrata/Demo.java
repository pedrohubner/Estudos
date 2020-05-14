package com.playground.fabricabstrata;

import com.playground.fabricabstrata.cliente.ApertarBotao;
import com.playground.fabricabstrata.fabrica.FabricaControle;
import com.playground.fabricabstrata.fabrica.FabricaControlePortao;
import com.playground.fabricabstrata.fabrica.FabricaControleTV;
import com.playground.fabricabstrata.fabrica.FabricaControleVideoGame;

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
