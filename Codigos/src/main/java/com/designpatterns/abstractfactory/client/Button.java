package com.designpatterns.abstractfactory.client;

import com.designpatterns.abstractfactory.factory.ControlFactory;
import com.designpatterns.abstractfactory.project.Control;

public class Button {

    private Control control;

    public Button(ControlFactory factory) {
        control = factory.createControl();
    }

    public void pressButton(){
        control.button();
    }
}
