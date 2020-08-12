package com.designpatterns.abstractfactory.project;

public class VideoGameControl implements Control {

    @Override
    public void button() {
        System.out.println("Aperte o botão do controle para iniciar o VideoGame.");
    }
}
