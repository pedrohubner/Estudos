package com.designpatterns.abstractfactory.project;

public class TVControl implements Control {

    @Override
    public void button(){
        System.out.println("Aperte o botão do controle para ligar a TV.");
    }
}
