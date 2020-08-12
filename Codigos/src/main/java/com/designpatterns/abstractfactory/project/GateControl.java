package com.designpatterns.abstractfactory.project;

public class GateControl implements Control {

    @Override
    public void button(){
        System.out.println("Aperte o botão do controle para abrir o portão.");
    }
}
