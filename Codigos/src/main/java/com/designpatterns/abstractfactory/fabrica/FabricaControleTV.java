package com.designpatterns.abstractfactory.fabrica;

import com.designpatterns.abstractfactory.projeto.Controle;
import com.designpatterns.abstractfactory.projeto.ControleTV;

public class FabricaControleTV implements FabricaControle {

    public void sayHi() {
        System.out.println("Hi!");
    }

    @Override
    public Controle criarControle() {
        return new ControleTV();
    }
}
