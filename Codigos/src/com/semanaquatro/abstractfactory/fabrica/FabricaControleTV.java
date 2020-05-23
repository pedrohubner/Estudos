package com.semanaquatro.abstractfactory.fabrica;

import com.semanaquatro.abstractfactory.projeto.Controle;
import com.semanaquatro.abstractfactory.projeto.ControleTV;

public class FabricaControleTV implements FabricaControle {

    public void sayHi() {
        System.out.println("Hi!");
    }

    @Override
    public Controle criarControle() {
        return new ControleTV();
    }
}
